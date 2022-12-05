package ListaExercicios01;

import java.util.Scanner;

public class Exercicio010 {
    // 10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior,
    // diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal maior: ");
        int D = ler.nextInt();

        System.out.print("Digite o valor da diagonal menor: ");
        int d = ler.nextInt();

        int a = D * d / 2;

        System.out.print("A área do losango é: " + a);
        ler.close();
    }
}
