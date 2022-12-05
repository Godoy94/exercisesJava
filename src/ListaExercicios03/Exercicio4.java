package ListaExercicios03;

import java.util.*;

public class Exercicio4 {
    // 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
    // porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
    // Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
    // escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
    // escrever o custo final ao consumidor.

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Custo de Frabricação do Automovel: ");

        float custoAutomovel = scanner.nextFloat();

        float distribuidoraPorcentagem = (custoAutomovel / 100) * 28;
        float impostoPorcentagem = (custoAutomovel / 100) * 45;
        float valorFiinalConsumidor = (distribuidoraPorcentagem + impostoPorcentagem) + custoAutomovel;

        System.out.print("O custo Final ao Consumidor é : " + valorFiinalConsumidor);

        scanner.close();
    }
}
