package Tarefa04;

import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        // 2) Elaborar um programa que calcule e apresente o volume de uma caixa
        // * retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor do Comprimento: ");
        float comprimento = scanner.nextFloat();
        System.out.print("Digite o valor da Largura: ");
        float largura = scanner.nextFloat();
        System.out.print("Digite Valor da Altura: ");
        float altura = scanner.nextFloat();

        float volume = comprimento * largura * altura;
        System.out.print("O volume da Caixa é : " + volume);
        scanner.close();
    }
}
