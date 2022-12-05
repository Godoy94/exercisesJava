package Tarefa03;

import java.util.*;

public class Exercicio010 {
    // 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
    // e efetuar a troca dos valores de forma que a variável
    // A passe a possuir o valor da variável B e a variável B passe a possuir o
    // valor da variável A.
    // Apresentar os valores trocados.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        double C = B;
        double D = A;

        A = D;
        B = C;

        System.out.print("O valor de A agora é: " + B);
        System.out.print("O valor de B agora é: " + A);
        scanner.close();
    }
}
