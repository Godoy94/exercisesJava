package Tarefa02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Solicite a entrada de dois valores pelo teclado e exiba sua soma
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int num1 = ler.nextInt();

		System.out.print("Digite o segundo numero: ");
		int num2 = ler.nextInt();

		int soma = num1 + num2;
		System.out.print("A soma dos numeros digitado é: " + soma);

		ler.close();
	}

}
