package ListaExercicios03;

import java.util.*;

public class Exercicio3 {
    // 3) Ler dois inteiros (variáveis A e B) e imprimir o
    // resultado do quadrado da diferença do primeiro valor pelo segundo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        double dif = Math.pow(a % b, 2);

        System.out.print("O quadrado da diferença é: " + dif);
        scanner.close();
    }
}
