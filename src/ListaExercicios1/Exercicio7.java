package ListaExercicios1;

import java.util.Scanner;

public class Exercicio7 {
    // 7) Escreva um algoritmo para ler as dimensões de um retângulo (base e
    // altura), calcular e escrever a área do retângulo. Dica a=b.h
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da base do retângulo: ");
        int base = ler.nextInt();

        System.out.print("Digite o valor da altura do retângulo: ");
        int altura = ler.nextInt();

        int a = base * altura;

        System.out.println("A área do retângulo é: " + a);
        ler.close();
    }
}
