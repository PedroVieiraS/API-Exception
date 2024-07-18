package com.exception.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void Menuinicial() {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        String[] nomes = {"Lucas", "Enzo", "Eloisa"};

        while (menu) {
            System.out.println("Menu:");
            System.out.println("1-");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.print("Escolha uma opção: ");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Você escolheu a Opção 1.");
                        for (String string : nomes) {
                            System.out.println(string);
                        }
                        System.out.println("Esolha o index do seu nome desejado:");
                        int nomeDesejado = scanner.nextInt();

                        if(nomeDesejado >= 0 && nomeDesejado < nomes.length){
                            String nomeString = nomes[nomeDesejado];
                            System.out.println("Nome encontrado!" + nomeString);
                        }else{
                            System.out.println("Índice inválido.");
                        };

                        break;
                    case 2:
                        System.out.println("Você escolheu a Opção 2.");
                        break;
                    case 3:
                        System.out.println("Você escolheu a Opção 3.");
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        menu = false;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Índice fora dos limites. Por favor, insira um índice válido.");
            }
        }
    }
}
