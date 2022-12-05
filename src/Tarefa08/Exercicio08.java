package Tarefa08;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
         * 8) Elaborar um programa que apresente os valores de conversão de graus
         * Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus
         * Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os
         * valores das duas temperaturas. A fórmula de conversão é F = (9*C +160) /5,
         * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
         */

        int celsius = 0;
        while (celsius <= 10) {
            int cont02 = celsius * 10;
            int Fahrenheit = (9 * cont02 + 160) / 5;
            System.out.print(cont02 + "ºC" + " são " + Fahrenheit + "ºF");
            celsius++;
        }
    }
}
