package Tarefa03;

import java.util.Scanner;

public class Exercicio04 {
    // 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
    // porcentagem do distribuidor e dos impostos
    // (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
    // seja de 28% e os impostos de 45%, escrever um
    // algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
    // custo final ao consumidor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Custo de fábrica do veículo: ");
        double valorFabrica = scanner.nextDouble();
        double calculoImpostos = valorFabrica / 100 * 73;
        double valorFinal = valorFabrica + calculoImpostos;

        System.out.print("\nO valor de fábrica do veículo é R$ " + valorFabrica);
        System.out.print("O valor total de impostos sobre o veículo é R$ " + calculoImpostos);
        System.out.print("O valor final do veículo é R$ " + valorFinal);
        scanner.close();
    }
}
