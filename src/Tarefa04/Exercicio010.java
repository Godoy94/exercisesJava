package Tarefa04;

import java.util.*;

public class Exercicio010 {
    public static void main(String[] args) {
        // 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
        // e efetuar a troca dos valores de forma que a variável A passe a possuir o
        // valor da variável B
        // e a variável B passe a possuir o valor da variável A.
        // Apresentar os valores trocados.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();
        double trocaA = b;
        double trocaB = a;

        System.out.print("O valor da variável A agora é: " + trocaA);
        System.out.print("O valor da variável B agora é: " + trocaB);

        scanner.close();
    }
}
