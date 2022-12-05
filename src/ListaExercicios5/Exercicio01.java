package ListaExercicios5;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for
        // maior que 10, caso
        // contrário escrever NÃO É MAIOR QUE 10!

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 10) {
            System.out.print("É MAIOR QUE 10");
        } else {
            System.out.print("NÃO É MAIOR QUE 10");
        }

        scanner.close();
    }
}
