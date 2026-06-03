package view;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner sc = new Scanner(System.in);

    public void exibirMenu(){

        int opcao;

        do{

            System.out.println("\n=== GESTOR DE PROJETOS ===");

            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Criar Projeto");
            System.out.println("3 - Adicionar Atividade");
            System.out.println("4 - Confirmar Projeto");
            System.out.println("5 - Cancelar Projeto");
            System.out.println("6 - Reagendar Projeto");
            System.out.println("7 - Listar Projetos");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

        }while(opcao != 0);
    }
}
