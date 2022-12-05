package Tarefa05;

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        // 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever
        // o maior deles.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.print("O primeiro valor é maior");
        } else {
            System.out.print("O segundo valor é maior");
        }

        scanner.close();
    }
}
