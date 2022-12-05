package Tarefa07;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
         * 8) Seja o seguinte algoritmo:
         * início
         * ler x
         * ler y
         * z <- (x*y) + 5
         * se z <= 0 então
         * resposta <- ‘A’
         * senão
         * se z <= 100 então
         * resposta <- ‘B’
         * senão
         * resposta <- ‘C’
         * fim_se
         * fim_se
         * escrever z, resposta
         * fim
         * Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        float valorX = scanner.nextFloat();
        System.out.print("Digite o valor do Y: ");
        float valorY = scanner.nextFloat();
        float valorZ = (valorX * valorY) + 5;
        if (valorZ <= 0) {
            System.out.print("A");
        } else if (valorZ <= 100) {
            System.out.print("B");
        } else {
            System.out.print("C");
        }

        scanner.close();
    }
}
