package Tarefa08;

import java.util.*;

public class Exercicio09 {
    /*
     * 9) Elaborar um programa que efetue a leitura de 10 valores numéricos e
     * apresente no final o total do somatório e a média aritmética dos valores
     * lidos.
     */

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        float numero01 = scanner.nextFloat();
        float numero02 = scanner.nextFloat();
        float numero03 = scanner.nextFloat();
        float numero04 = scanner.nextFloat();
        float numero05 = scanner.nextFloat();
        float numero06 = scanner.nextFloat();
        float numero07 = scanner.nextFloat();
        float numero08 = scanner.nextFloat();
        float numero09 = scanner.nextFloat();
        float numero010 = scanner.nextFloat();
        float somatoria = numero01 + numero02 + numero03 + numero04 + numero05 + numero06 + numero07 + numero08
                + numero09 + numero010;
        float mediaAritmetica = somatoria / 10;
        System.out.print("A soma dos 10 valores é: " + somatoria + ", e a Média aritmedica é: " + mediaAritmetica);

        scanner.close();
    }
}
