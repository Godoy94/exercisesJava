package ListaExercicios1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// solicite a entrada de dois valores do teclado e exiba sua subtracao
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int num1 = ler.nextInt();

		System.out.print("Digite o segundo numero: ");
		int num2 = ler.nextInt();

		int subtracao = num1 - num2;
		System.out.print("A subtração dos numeros digitado é: " + subtracao);

		ler.close();
	}

}
