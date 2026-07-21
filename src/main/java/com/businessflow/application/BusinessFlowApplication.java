package com.businessflow.application;

import java.util.Scanner;

public class BusinessFlowApplication {
    public static void main(String[] args) {

        String nomeSistema = "BusinessFlow";
        String descricaoSistema = "Sistema de Gestão de Serviços";
        String versaoSistema = "v0.1";


        System.out.println("=========================================");
        System.out.println("            " + nomeSistema + " " + versaoSistema);
        System.out.println(descricaoSistema);
        System.out.println("=========================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Bem vindo, "+ nomeUsuario + "!");
        System.out.println("Inicializando aplicação...");

        System.out.println();
        System.out.println("============================");
        System.out.println("      MENU PRINCIPAL");
        System.out.println("============================");
        System.out.println("1 - Clientes");
        System.out.println("2 - Serviços");
        System.out.println("3 - Agenda");
        System.out.println("0 - Sair");
        System.out.println();

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Abrindo módulo de clientes...");
                break;

            case 2:
                System.out.println("Abrindo módulo de serviços...");
                break;

            case 3:
                System.out.println("Abrindo módulo de agenda...");
                break;

            case 0:
                System.out.println("Encerrando BusinessFlow...");
                break;

                default:
                    System.out.println("Opção inválida.");
        }



    }
}
