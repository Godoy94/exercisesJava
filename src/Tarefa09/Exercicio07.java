package Tarefa09;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
         * 7) Elaborar um programa que apresente como resultado o valor do fatorial dos
         * valores ímpares
         * situados na faixa numérica de 1 a 10.
         */
        int numero = 10;
        int contador = 1;
        int fatorial = 1;
        do {
            if (numero % 2 != 0) {
                fatorial = fatorial * contador;
            }
            System.out.println(fatorial);
            contador++;
        } while (contador <= numero);
    }
}
