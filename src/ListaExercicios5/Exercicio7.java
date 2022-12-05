package ListaExercicios5;

import java.util.*;

public class Exercicio7 {
    public static void main(String[] args) {
        // 7) Ler dois valores (considere que não serão lidos valores iguais)
        // e escrevê-los em ordem crescente.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o  primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        if (valor1 < valor2) {
            System.out.print(valor1 + " " + valor2);
        } else {
            System.out.print(valor2 + " " + valor1);
        }

        scanner.close();
    }
}
