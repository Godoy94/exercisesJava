package ListaExercicios4;

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        // 6) Elaborar um programa que efetue a leitura de três valores (A, B e C)
        // e apresente como resultado final à soma dos quadrados dos três valores lidos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double valorA = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double valorB = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double valorC = scanner.nextDouble();
        double somaTotal = Math.pow(valorA, 2) + Math.pow(valorB, 2) + Math.pow(valorC, 2);

        System.out.print("O valor da soma dos quadrados é numeros é: " + somaTotal);

        scanner.close();
    }
}
