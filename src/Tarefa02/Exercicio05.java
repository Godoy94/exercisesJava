package Tarefa02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Solicite a entrada de dois valores no teclado e exiba sua multiplicao
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int num1 = ler.nextInt();

		System.out.print("Digite o segundo numero: ");
		int num2 = ler.nextInt();

		int multiplicacao = num1 * num2;
		System.out.print("A multiplicacao dos numeros digitado é: " + multiplicacao);

		ler.close();
	}

}
