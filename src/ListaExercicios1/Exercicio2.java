package ListaExercicios1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// ex2 = Solicite a entrada de um valor do teclado e exiba seu antecessor
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int num1 = ler.nextInt();
		int antecessor = --num1;

		System.out.println("O antecessor do numero digitado é: " + antecessor);
		ler.close();
	}

}
