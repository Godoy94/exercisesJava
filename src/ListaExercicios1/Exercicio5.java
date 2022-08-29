package ListaExercicios1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Solicite a entrada de dois valores no teclado e exiba sua multiplicao
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = ler.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = ler.nextInt();

		int multiplicacao = num1 * num2;
		System.out.println("A multiplicacao dos numeros digitado é: " + multiplicacao);

		ler.close();
	}

}
