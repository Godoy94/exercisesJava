package ListaExercicios3;

import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        // 8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma
        // viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o
        // cálculo, o usuário deve fornecer o tempo gasto

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Tempo gasto percorrido pelo o carro: ");
        float tempo = scanner.nextFloat();
        float quilometros = tempo * 12;

        float quantidadeDeLitrosGasto = quilometros / 12;
        System.out.print("O automovel percorreu " + quilometros + " Km ");
        System.out.print("Em um tempo de " + tempo + " Hrs ");
        System.out.print(
                "A quantidade de Litros de combustivel gasto na viagem foi de " + quantidadeDeLitrosGasto + " litros");

        scanner.close();
    }
}
