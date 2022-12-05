package ListaExercicios4;

import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        // 8) Elaborar um programa de computador que efetue a leitura de quatro valores
        // inteiros (variáveis A, B, C e D).
        // Ao final o programa deve apresentar o resultado do produto (variável P) do
        // primeiro com o terceiro valor e
        // o resultado da soma (variável S) do segundo com o quarto valor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A.");
        int valorA = scanner.nextInt();
        System.out.print("Digite o valor de B.");
        int valorB = scanner.nextInt();
        System.out.print("Digite o valor de C.");
        int valorC = scanner.nextInt();
        System.out.print("Digite o valor de D.");
        int valorD = scanner.nextInt();
        int resultadoProduto = valorA * valorC;
        int resultadoSoma = valorB + valorD;

        System.out.print("O Resultado do produto é : " + resultadoProduto);
        System.out.print("O Resultado da soma é : " + resultadoSoma);

        scanner.close();
    }
}
