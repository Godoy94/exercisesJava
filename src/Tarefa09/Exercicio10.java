package Tarefa09;

import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
         * 10) Elaborar um programa que apresente o resultado inteiro da divisão
         * de dois números quaisquer. Para a elaboração do programa, não utilizar
         * em hipótese alguma o conceito do operador aritmético DIV. A solução deve
         * ser alcançada com a utilização de looping. Ou seja, o programa deve
         * apresentar como resultado (quociente) quantas vezes o divisor cabe no
         * dividendo.
         */
        int numero1, numero2, acumuladora, contadora = 1, soma = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("dividido por: ");
        numero2 = sc.nextInt();

        do {
            soma++;
            acumuladora = numero2 * contadora;
            contadora++;
        } while (acumuladora <= numero1);
        System.out.println(soma);

        sc.close();
    }
}
