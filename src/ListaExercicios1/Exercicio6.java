package ListaExercicios1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// solicite a entrada de dois valores do teclado e exiba sua divisao
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = ler.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = ler.nextInt();

		int divisao = num1 / num2;
		System.out.println("A divisão dos numeros digitado é: " + divisao);

		ler.close();
	}

}
