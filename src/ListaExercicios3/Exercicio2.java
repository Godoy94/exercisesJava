package ListaExercicios3;

import java.util.*;

public class Exercicio2 {
    // 2) Elaborar um programa que calcule e apresente o volume de uma caixa
    // retangular,
    // por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do comprimento: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite o valor da largura: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite o valor da altura");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.print("O volume calculado foi de : " + volume + "M³");
        scanner.close();
    }
}
