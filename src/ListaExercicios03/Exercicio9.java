package ListaExercicios03;

import java.util.*;

public class Exercicio9 {
    public static void main(String[] args) {
        // 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
        // utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de tempo que está em atraso ");
        int tempoAtraso = scanner.nextInt();
        System.out.print("Digite o valor da prestação ");
        double valorPrestacao = scanner.nextDouble();
        System.out.print("Digite o valor da taxa de juros ");
        double taxaJuros = scanner.nextDouble();
        double valorPrestacaoAtraso = valorPrestacao + (valorPrestacao * taxaJuros / 100) * tempoAtraso;

        System.out.print("O valor atualizado da prestação é: R$" + valorPrestacaoAtraso);

        scanner.close();
    }
}
