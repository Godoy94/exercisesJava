package ListaExercicios06;

import java.util.*;

public class Exercicio010 {
    public static void main(String[] args) {
        // 10. Elaborar um programa que efetue a leitura de um número inteiro e
        // apresentar uma mensagem informando se o número é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float valorParOuImpar = scanner.nextFloat();
        if (valorParOuImpar % 2 == 1) {
            System.out.print("O seu numero é Impar");
        } else {
            System.out.print("O seu numero é Par");
        }
        scanner.close();
    }
}
