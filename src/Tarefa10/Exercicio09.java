package Tarefa10;

public class Exercicio09 {
    public static void main(String[] Args) {
        /*
         * 9) Escreva um programa que apresente a série de Fibonacci até o décimo quinto
         * termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13,
         * 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o
         * seu anterior subseqüente, para que seja formado o próximo valor da seqüência.
         * Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é
         * 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
         */
        int anterior = 1, posterior = 1, auxiliar, contador = 1;
        do {
            System.out.print(anterior + " ");
            auxiliar = anterior + posterior;
            anterior = posterior;
            posterior = auxiliar;
            contador++;
        } while (contador <= 15);
    }
}
