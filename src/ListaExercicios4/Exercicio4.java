package ListaExercicios4;

import java.util.*;

public class Exercicio4 {
    // 4) Elaborar um programa que efetue a apresentação do valor da conversão
    // em real de um valor lido em dólar.

    // O programa deve solicitar o valor da cotação do dólar e também a quantidade
    // de dólares disponível com o usuário,
    // para que seja apresentado o valor em moeda brasileira.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dolar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantidade de dolares que voce possui: ");
        double quantidadeDolares = scanner.nextDouble();
        double conversao = cotacaoDolar * quantidadeDolares;

        System.out.print("O valor convertido em reais é de: " + conversao);

        scanner.close();
    }
}
