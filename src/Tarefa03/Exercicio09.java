package Tarefa03;

import java.util.*;

public class Exercicio09 {
    // 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
    // utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação R$: ");
        double valorPrestacao = scanner.nextDouble();
        System.out.print("Digite o valor da taxa de juros %: ");
        double valorTaxa = scanner.nextDouble();
        System.out.print("Digite o tempo em atraso: ");
        double valorTempo = scanner.nextDouble();

        double prestacao = valorPrestacao + (valorPrestacao * valorTaxa / 100) * valorTempo;

        System.out.print("O valor da prestação em atraso é de R$: " + prestacao);
        scanner.close();
    }
}
