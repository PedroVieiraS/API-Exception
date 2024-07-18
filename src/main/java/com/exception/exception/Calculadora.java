package com.exception.exception;

import java.util.Scanner;

public class Calculadora {
    
    
    public static void Calcular() {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("informe seu numero:");
            double dividendo = scanner.nextDouble();

            System.out.println("informe seu numero:");
            double divisor = scanner.nextDouble();

            double result = dividendo/divisor;

            System.out.println("a resposta da sua divisao e:"+ result);

        } catch (ArithmeticException e) {
            System.out.println("Erro:" + e.getCause());
        }
    }
    
}
