package Tarefa10;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] Args) {
        /*
         * 8) Elaborar um programa que apresente como resultado o valor de uma potência
         * de uma base
         * 
         * qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor
         * da base e E o valor do expoente. Observe que neste exercício não pode ser
         * utilizado o operador de exponenciação do portuguol (^).
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de potência");
        System.out.println("Entre com a base");
        int base = scanner.nextInt();
        System.out.println("Entre com o expoente");
        int exp = scanner.nextInt();
        int potencia = 1;
        int count = 1;
        while (count <= exp) {
            potencia *= base;
            count++;
        }
        System.out.println(base + " ^ " + exp + " = " + potencia);

        scanner.close();
    }
}
