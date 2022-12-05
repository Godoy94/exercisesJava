package ListaExercicios06;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        // 8. Efetuar a leitura de quatro números inteiros e apresentar os números que
        // são divisíveis por 2 e 3.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Primeiro Valor: ");
        float valor01 = scanner.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float valor02 = scanner.nextFloat();
        System.out.print("Digite o terceiro valor: ");
        float valor03 = scanner.nextFloat();
        System.out.print("Digite o quarto valor: ");
        float valor04 = scanner.nextFloat();
        if (((valor01 % 2) == 0) || ((valor01 % 3) == 0)) {
            System.out.print("E divisivel por 2 ou 3 " + valor01);
            if (((valor02 % 2) == 0) || ((valor02 % 3) == 0)) {
                System.out.print("E divisivel por 2 ou 3 " + valor02);
                if (((valor03 % 2) == 0) || ((valor03 % 3) == 0)) {
                    System.out.print("E divisivel por 2 ou 3 " + valor03);
                    if (((valor04 % 2) == 0) || ((valor04 % 3) == 0)) {
                        System.out.print("E divisivel por 2 ou 3 " + valor04);
                    }
                }
            }
        }

        scanner.close();
    }
}
