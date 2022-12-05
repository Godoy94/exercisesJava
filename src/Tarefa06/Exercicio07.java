package Tarefa06;

import java.util.*;

public class Exercicio07 {
    public static void main(String[] args) {

        // 7. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los
        // dispostos em ordem crescente.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Valor A: ");
        float valorA = scanner.nextFloat();
        System.out.print("Digite o Valor B: ");
        float valorB = scanner.nextFloat();
        System.out.print("Digite o Valor C: ");
        float valorC = scanner.nextFloat();
        if (valorA <= valorB && valorB <= valorC) {
            System.out.print("A ordem crescente: " + valorA + (" , ") + valorB + (" , ") + valorC);
        } else if (valorA <= valorC && valorC <= valorB) {
            System.out.print("A ordem crescente: " + valorA + (" , ") + valorC + (" , ") + valorB);
        } else if (valorB <= valorA && valorA <= valorC) {
            System.out.print("A ordem crescente: " + valorB + (" , ") + valorA + (" , ") + valorC);
        } else if (valorB <= valorC && valorC <= valorA) {
            System.out.print("A ordem crescente: " + valorB + (" , ") + valorC + (" , ") + valorA);
        } else if (valorC <= valorA && valorA <= valorB) {
            System.out.print("A ordem crescente: " + valorC + (" , ") + valorA + (" , ") + valorB);
        } else {
            System.out.print("A ordem crescente: " + valorC + (" , ") + valorB + (" , ") + valorA);
        }

        scanner.close();
    }
}
