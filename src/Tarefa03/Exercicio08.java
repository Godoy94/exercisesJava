package Tarefa03;

import java.util.*;

public class Exercicio08 {
    // 8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma
    // viagem,
    // utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o
    // usuário deve fornecer o tempo gasto
    // (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será
    // possível obter a distância
    // percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da
    // distância, basta calcular a
    // quantidade de litros de combustível utilizada na viagem com a fórmula
    // LITROS_USADOS=DISTANCIA/12. Ao final,
    // o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo
    // gasto na viagem (TEMPO),
    // a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS)
    // utilizada na viagem.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de tempo gasto na viagem: ");
        double tempoGasto = scanner.nextDouble();
        System.out.print("Digite a velocidade media na viagem: ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;
        double consumo = distancia / 12;

        System.out.print("O tempo gasto foi: " + tempoGasto);
        System.out.print("A velocidade media foi: " + velocidadeMedia);
        System.out.print("A Distancia percorrida foi: " + distancia);
        System.out.print("A consumo foi: " + consumo);
        scanner.close();
    }
}
