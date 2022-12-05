package Tarefa08;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um
        // número qualquer.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qual Tabuada deseja: ");
        int escolhaTabuada = scanner.nextInt();
        int contador = 0;
        while (contador <= 10) {
            int resultado = contador * escolhaTabuada;
            System.out.print(contador + " X " + escolhaTabuada + " = " + resultado);
            contador++;
        }

        scanner.close();
    }
}
