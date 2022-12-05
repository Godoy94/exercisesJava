package ListaExercicios5;

import java.util.*;

public class Exeercicio012 {
    public static void main(String[] args) {

        // 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade
        // máxima em estoque e quantidade mínima em estoque de um produto. Calcular e
        // escrever a quantidade média ((quantidademédia = quantidade máxima +
        // quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
        // quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a
        // mensagem 'Efetuar compra'.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Quantidade Atual em Estoque do Produto: ");
        float qtdEstoque = scanner.nextFloat();

        System.out.print("Digite a Quantidade Maxima do Estoque: ");
        float maxEstoque = scanner.nextFloat();

        System.out.print("Digite a Quantidade Minima do Estoque: ");
        float minEstoque = scanner.nextFloat();

        float qtdMedia = (maxEstoque + minEstoque) / 2;

        if (qtdEstoque >= qtdMedia) {
            System.out.print("Não Efetuar Compra");
        } else {
            System.out.print("Efetuar Compra");
        }

        scanner.close();

    }
}
