package Tarefa05;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        // 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
        // 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia o número
        // de maçãs compradas, calcule e escreva o custo total da compra.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maças compradas");
        int qtdMacas = scanner.nextInt();

        if (qtdMacas <= 12) {
            double valorMaca = 1.30;
            double valorCompra = qtdMacas * valorMaca;

            System.out.print(
                    "A quantidade de maças compradas foi de " + qtdMacas + " nesse caso cada maça saiu a um valor de "
                            + valorMaca + " e a compra ficou num total de " + valorCompra);
        } else {
            double valorMaca = 1.00;
            double valorCompra = qtdMacas * valorMaca;

            System.out.print(
                    "A quantidade de maças compradas foi de " + qtdMacas + " nesse caso cada maça saiu a um valor de "
                            + valorMaca + " e a compra ficou num total de " + valorCompra);
        }

        scanner.close();
    }
}
