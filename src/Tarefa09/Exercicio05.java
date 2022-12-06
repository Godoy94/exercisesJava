package Tarefa09;

import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
         * 5) Elaborar um programa que efetue a leitura de 15 valores numéricos
         * inteiros e no final apresente ototal do somatório da fatorial de cada valor
         * lido.
         */
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int fatorial = 1;
        int contador = 1;
        int contador2 = 1;
        int soma;
        do {
            System.out.println("Digite o valor numero: " + contador);
            numero = sc.nextInt();
            do {
                fatorial = fatorial * contador2;
                soma = fatorial;
                contador2++;
            } while (contador2 <= numero);
            System.out.println(soma);
            contador++;
        } while (contador <= 15);

        sc.close();
    }
}
