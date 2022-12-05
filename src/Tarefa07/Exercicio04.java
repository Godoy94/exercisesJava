package Tarefa07;

import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        // 4) Ler 3 valores (considere que não serão informados valores iguais) e
        // escrevê-los em ordem crescente.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor 1 :");
        int valor01 = scanner.nextInt();
        System.out.print("Digite o valor 2 :");
        int valor02 = scanner.nextInt();
        System.out.print("Digite o valor 3 :");
        int valor03 = scanner.nextInt();
        if (valor01 > valor02 && valor01 > valor03 && valor02 > valor03) {
            System.out.print(valor01 + " , " + valor02);
            System.out.print("Os numero digitados em ordem crescente: " + valor02 + (" , ") + valor01);
        } else if (valor02 > valor01 && valor02 > valor03 && valor03 > valor01) {
            System.out.print(valor02 + " , " + valor03);
            System.out.print("Os numero digitados em ordem crescente: " + valor03 + (" , ") + valor02);
        } else if (valor03 > valor01 && valor03 > valor02 && valor02 > valor01) {
            System.out.print(valor03 + " , " + valor02);
            System.out.print("Os numero digitados em ordem crescente: " + valor02 + (" , ") + valor03);
        } else if (valor02 > valor01 && valor02 > valor03 && valor01 > valor03) {
            System.out.print(valor02 + " , " + valor01);
            System.out.print("Os numero digitados em ordem crescente : " + valor01 + (" , ") + valor02);
        }

        scanner.close();
    }
}
