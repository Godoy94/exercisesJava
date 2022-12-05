package Tarefa08;

public class Exercicio03 {
    public static void main(String[] args) {
        // 3) Elaborar um programa que apresente no final o somatório dos valores pares
        // existentes na faixa de 1 até 500.

        int n1 = 0;
        int i;

        for (i = 2; i <= 500; i += 2) {
            if (i % 2 == 0)
                n1 += i;
            System.out.print(i + " = " + n1);
        }
    }
}
