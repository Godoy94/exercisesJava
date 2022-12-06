package Tarefa10;

public class Exercicio04 {
    /*
     * 4) Elaborar um programa que apresente no final o somatório dos valores pares
     * existentes na faixa de 1 até 500.
     */

    public static void main(String[] Args) {

        int n1 = 0;
        int i;

        for (i = 2; i <= 500; i += 2) {
            if (i % 2 == 0)
                n1 += i;
            System.out.println(i + " = " + n1);
        }
    }
}
