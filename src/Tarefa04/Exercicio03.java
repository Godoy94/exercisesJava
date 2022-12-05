package Tarefa04;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        // 3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da
        // diferença do primeiro valor pelo segundo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da Variavel A: ");
        int variavelA = scanner.nextInt();
        int resultado = variavelA * variavelA;
        System.out.print("O resultado do Quadrado A é : " + resultado);
        System.out.print("Digite o valor da Variavel B: ");
        int variavelB = scanner.nextInt();
        int resultadoB = variavelB * variavelB;
        System.out.print("O resultado do Quadrado B é : " + resultadoB);
        if (resultado > resultadoB) {
            System.out.print("O resultado A é Maior que o B: " + resultado);
        } else {
            System.out.print("O resultado B é Maior que o A: " + resultadoB);
        }
        int diferenciaA = resultado - resultadoB;
        int diferenciaB = resultadoB - resultado;
        if (resultado > resultadoB) {
            System.out.print("A diferencia entre A e B é: " + diferenciaA);
        } else {
            System.out.print("A diferencia entre B e A é: " + diferenciaB);
        }

        scanner.close();
    }
}
