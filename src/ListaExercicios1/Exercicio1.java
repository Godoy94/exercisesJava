package ListaExercicios1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// ex2 = Solicite a entrada de um valor do teclado e exiba seu sucessor
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num1 = ler.nextInt();

		int sucessor = ++num1;
		System.out.print("O sucessor do numero digitado é: " + sucessor);

		ler.close();
	}

}
