package ListaExercicios1;

import java.util.Scanner;

public class Exercicio8 {
    // 8) Escreva um algoritmo para ler as dimensões de um triângulo (base e
    // altura), calcular e escrever a área do triângulo. Dica a=b.h/2
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        int base = ler.nextInt();

        System.out.print("Digite o valor da altura do triângulo: ");
        int altura = ler.nextInt();

        int a = base * altura / 2;
        System.out.print("A área do triângulo é: " + a);

        ler.close();
    }
}
