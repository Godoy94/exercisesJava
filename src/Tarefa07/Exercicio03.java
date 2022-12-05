package Tarefa07;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        // 3) Ler 3 valores (considere que não serão informados valores iguais) e
        // escrever a soma dos 2 maiores.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valor01 = scanner.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor02 = scanner.nextInt();
        System.out.print("Digite o valor 3: ");
        int valor03 = scanner.nextInt();
        if (valor01 > valor02 && valor01 > valor03 && valor02 > valor03) {
            System.out.print(valor01 + " , " + valor02);
            float resultado01 = valor01 + valor02;
            System.out.print("A soma dos 2 maiores numeros digitados foi: " + resultado01);
        } else if (valor02 > valor01 && valor02 > valor03 && valor03 > valor01) {
            System.out.print(valor02 + " , " + valor03);
            float resultado02 = valor02 + valor03;
            System.out.print("A soma dos 2 maiores numeros digitados foi: " + resultado02);
        } else if (valor03 > valor01 && valor03 > valor02 && valor02 > valor01) {
            System.out.print(valor03 + " , " + valor02);
            float resultado03 = valor03 + valor02;
            System.out.print("A soma dos 2 maiores numeros digitados foi: " + resultado03);
        } else if (valor02 > valor01 && valor02 > valor03 && valor01 > valor03) {
            System.out.print(valor02 + " , " + valor01);
            float resultado04 = valor02 + valor01;
            System.out.print("A soma dos 2 maiores numeros digitados foi: " + resultado04);
        }

        scanner.close();
    }
}
