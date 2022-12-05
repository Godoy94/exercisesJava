package Tarefa06;

import java.util.*;

public class Exercicio012 {
    public static void main(String[] args) {
        // 12. Elaborar um programa que efetue a leitura de um determinado valor
        // inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um Valor: ");
        int valor01 = scanner.nextInt();
        if (valor01 <= 3) {
            System.out.print("Valor digitado: " + valor01);
        }

        scanner.close();
    }
}
