package ListaExercicios1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Solicite a entrada de dois valores pelo teclado e exiba sua soma
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = ler.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = ler.nextInt();

		int soma = num1 + num2;
		System.out.println("A soma dos numeros digitado é: " + soma);

		ler.close();
	}

}
