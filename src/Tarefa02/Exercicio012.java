package Tarefa02;

import java.util.Scanner;

public class Exercicio012 {
    // 12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular
    // e escrever a área do circulo. a=pi*r²
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do raio");
        int raio = ler.nextInt();

        double a = 3.14 * Math.pow(raio, 2);

        System.out.print("A área do circulo é: " + a);
        ler.close();
    }
}
