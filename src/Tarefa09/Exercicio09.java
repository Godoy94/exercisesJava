package Tarefa09;

import java.util.*;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
         * 9) Elaborar um programa que efetue a leitura de valores
         * positivos inteiros até que um valor negativo seja informado.
         * Ao final devem ser apresentados o maior e o menor valores informados
         * pelo usuário.
         */
        int valor, maiorValor = 0, menorValor = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
            if (valor > maiorValor) {
                maiorValor = valor;
            } else {
                menorValor = valor;
            }
        } while (valor >= 0);
        System.out.println(maiorValor);
        System.out.println(menorValor);

        sc.close();
    }
}
