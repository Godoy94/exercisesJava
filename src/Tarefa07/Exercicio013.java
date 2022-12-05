package Tarefa07;

import java.util.*;

public class Exercicio013 {
    public static void main(String[] args) {
        // 13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade
        // adquirida e o preço unitário. Calcular e escrever o total (total = quantidade
        // adquirida * preço unitário), o desconto e o total a pagar (total a pagar =
        // total - desconto), sabendo-se que:
        // - Se quantidade <= 5 o desconto será de 2%
        // - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
        // - Se quantidade > 10 o desconto será de 5%

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Produto: ");
        String nomeProduto = scanner.next();

        System.out.print("Digite a Quantidade do produto: ");
        float quantidadeAdquirida = scanner.nextFloat();
        System.out.print("Digite o valor Unitario do Produto: ");
        float preceUnitario = scanner.nextFloat();

        float totalQuantidadeValorUnitario = quantidadeAdquirida * preceUnitario;

        if (quantidadeAdquirida <= 5) {
            float desconto = 2 * totalQuantidadeValorUnitario / 100;
            float valorComDesconto = totalQuantidadeValorUnitario - desconto;
            System.out.print("O seu Produto é " + nomeProduto + " e o valor total apagar com desconto de 2% e : "
                    + valorComDesconto);
        } else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
            float desconto02 = 3 * totalQuantidadeValorUnitario / 100;
            float valorConDesconto02 = totalQuantidadeValorUnitario - desconto02;
            System.out.print("O seu Produto é " + nomeProduto + " e o valor total apagar com desconto de 3% e : "
                    + valorConDesconto02);
        } else if (quantidadeAdquirida > 10) {
            float desconto03 = 5 * totalQuantidadeValorUnitario / 100;
            float valorComDesconto03 = totalQuantidadeValorUnitario - desconto03;
            System.out.print("O seu Produto é " + nomeProduto + " e o valor total apagar com desconto de 5% e : "
                    + valorComDesconto03);
        }

        scanner.close();
    }
}
