package ListaExercicios06;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {

        // 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença
        // do maior pelo menor valor.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor01 = scanner.nextInt();

        System.out.print("Digite o segundo Valor: ");
        int valor02 = scanner.nextInt();

        if (valor01 > valor02) {
            System.out.print("A diferencia entre os dois valores digitados é: " + (valor01 - valor02));
        } else {
            System.out.print("A diferencia entre os dois valores digitados é: " + (valor02 - valor01));
        }
        scanner.close();
    }
}
