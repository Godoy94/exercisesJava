package Tarefa02;

import java.util.Scanner;

public class Exercicio09 {
    // 9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular
    // e escrever a área do quadrado. Dica a=l²

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        int l = ler.nextInt();

        double a = Math.pow(l, 2);

        System.out.print("A área do quadrado é: " + a);
        ler.close();
    }
}
