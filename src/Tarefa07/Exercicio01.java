package Tarefa07;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1) Ler um valor e escrever se é positivo, negativo ou zero.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float numero01 = scanner.nextFloat();
        if (numero01 > 0) {
            System.out.print("Positivo");
        } else if (numero01 == 0) {
            System.out.print("Zero");
        } else {
            System.out.print("Negativo");
        }

        scanner.close();
    }
}
