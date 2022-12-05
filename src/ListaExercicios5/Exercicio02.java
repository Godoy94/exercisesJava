package ListaExercicios5;

import java.util.*;

public class Exercicio02 {

    public static void main(String[] args) {

        // 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero
        // como positivo).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 0) {
            System.out.print("O valor digitado é positivo");
        } else {
            System.out.print("O valor digitado é negativo");
        }

        scanner.close();

    }
}
