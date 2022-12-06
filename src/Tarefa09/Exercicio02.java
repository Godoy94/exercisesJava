package Tarefa09;

public class Exercicio02 {
    public static void main(String[] args) {
        // 2) Elaborar um programa que apresente no final o somatório dos valores pares
        // existentes na faixa de 1 até 500.
        int numero = 1;
        int somatorio = 0;
        do {
            if (numero % 2 == 0) {
                somatorio = somatorio + numero;
            }
            numero++;
        } while (numero <= 500);
        System.out.println(somatorio);
    }
}
