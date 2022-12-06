package Tarefa10;

import java.util.*;

public class Exercicio011 {
    public static void main(String[] args) {
        try (/*
              * 11) Elaborar um programa que apresente como resultado o valor do fatorial dos
              * valores ímpares situados na faixa numérica de 1 a 10.
              */
                Scanner scanner = new Scanner(System.in)) {
            int i;
            int n;
            int fat;

            System.out.print("Informe um numero");
            n = scanner.nextInt();

            fat = 1;
            for (i = 1; i < n; i++) {
                fat = fat * i;
            }
            System.out.printf("\nO fatorial de %d eh igual a %d.\n", n, fat);

            scanner.close();
        }
    }
}
