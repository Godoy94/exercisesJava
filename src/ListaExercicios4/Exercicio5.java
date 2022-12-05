package ListaExercicios4;

import java.util.*;

public class Exercicio5 {
    // 5) Elaborar um programa que efetue a apresentação do valor da conversão em
    // dólar de um valor lido em real.
    // O programa deve solicitar o valor da cotação do dólar e também a quantidade
    // de reais disponível com o usuário,
    // para que seja apresentado o valor em moeda americana.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do real: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantidade de reais que voce possui: ");
        double quantidadeReais = scanner.nextDouble();
        double conversao = cotacaoDolar * quantidadeReais;

        System.out.print("O valor convertido em dólares é de: " + conversao);

        scanner.close();
    }
}
