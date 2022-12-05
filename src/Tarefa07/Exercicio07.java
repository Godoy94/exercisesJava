package Tarefa07;

import java.util.*;

public class Exercicio07 {
    public static void main(String[] args) {
        // 7) Ler dois valores e imprimir uma das três mensagens a seguir:
        // ‘Números iguais’, caso os números sejam iguais
        // ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
        // ‘Segundo maior’, caso o segundo seja maior que o primeiro.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor01 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor02 = scanner.nextInt();
        if (valor01 == valor02) {
            System.out.print("Os numero são iguais");
        } else if (valor01 > valor02) {
            System.out.print("O primeiro valor e o maior");
        } else if (valor02 > valor01) {
            System.out.print("O segundo valor e o maior");
        }

        scanner.close();
    }
}
