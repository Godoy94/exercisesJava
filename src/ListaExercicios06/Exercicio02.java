package ListaExercicios06;

import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {

        // 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
        // número lido como sendo um valor positivo, ou seja, o programa deverá
        // apresentar o módulo de um número fornecido. Lembre-se de verificar se o
        // número fornecido é menor que zero; sendo, multiplique-o por -1.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um Valor Positivo ou Negativo: ");
        int valor01 = scanner.nextInt();
        if (valor01 < 0) {
            int valor02 = valor01 * (-1);
            System.out.print("O modulo do Numero informado é : " + valor02);
        }

        scanner.close();
    }
}
