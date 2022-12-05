package Tarefa04;

import java.util.*;

public class Exercicio07 {
    public static void main(String[] args) {
        // 7) Elaborar um programa que efetue a leitura de três valores (A, B e C)
        // e apresente como resultado final o quadrado da soma dos três valores lidos.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor de A:");
        int valorA = scanner.nextInt();
        System.out.print("Digite valor de B:");
        int valorB = scanner.nextInt();
        System.out.print("Digite valor de C:");
        int valorC = scanner.nextInt();
        double resultado = Math.pow(valorA, 2) + Math.pow(valorB, 2) + Math.pow(valorC, 2);

        System.out.print("Resultado da soma dos quadrados: " + resultado);
        scanner.close();
    }
}
