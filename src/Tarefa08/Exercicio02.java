package Tarefa08;

public class Exercicio02 {
    public static void main(String[] args) {
        // 2) Apresentar o total da soma obtida dos cem primeiros numeros inteiros
        // (1+2+3+4+...+98+99+100).
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.print("A soma dos 100 primeiros numeros: " + soma);
    }
}
