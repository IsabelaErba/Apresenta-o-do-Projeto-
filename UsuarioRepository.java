package repository;

import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioRepository {

    public void salvar(Usuario usuario){

        String sql =
                "INSERT INTO usuarios(nome,email,telefone,data_nascimento)"
                        + " VALUES(?,?,?,?)";

        try(Connection conn =
                    ConnectionFactory.getConnection()) {

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setDate(
                    4,
                    java.sql.Date.valueOf(
                            usuario.getDataNascimento()));

            stmt.executeUpdate();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
