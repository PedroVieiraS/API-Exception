package com.exception.exception;

import java.util.Scanner;

public class ListarNomes {

    public static void Listar() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Lucas", "Enzo", "Eloisa"};

        try {
            
            for (int i = 0; i < nomes.length; i++) {
                System.out.println( "Nome " + (i+1) + ": " + nomes[i]);
            }

            System.out.println("Esolha o index do seu nome desejado:");
            int nomeDesejado = scanner.nextInt();
    
            if(nomeDesejado >= 0 && nomeDesejado < nomes.length){
                String nomeString = nomes[nomeDesejado];
                System.out.println("Nome encontrado!" + nomeString);
            }else{
                System.out.println("Índice inválido.");
            };
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice fora dos limites. Por favor, insira um índice válido.");
        }
    }

}
