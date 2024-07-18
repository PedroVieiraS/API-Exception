package com.exception.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void Menuinicial() {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        

        while (menu) {
            System.out.println("Menu:");
            System.out.println("1- Dividir por zero");
            System.out.println("2- Listar nomes");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                    System.out.println("Você escolheu a Opção 1.");
                    Calculadora.Calcular();
                    break;

                    case 2:
                    System.out.println("Você escolheu a Opção 3.");
                    ListarNomes.Listar();
                    break;

                    case 3:
                        System.out.println("Saindo...");
                        menu = false;
                    break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                    break;
                    }


            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.nextLine();
            }
        }
    }
}
