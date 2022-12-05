package Tarefa05;

import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) {
        // 5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
        // que diga se ela poderá ou não votar este ano (não é necessário considerar o
        // mês em que a pessoa nasceu).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int calculo = anoAtual - anoNascimento;
        if (calculo >= 18) {
            System.out.print("Sua idade é " + calculo + " poderá votar");
        } else {
            System.out.print("Sua idade é " + calculo + " não poderá votar");
        }

        scanner.close();
    }
}
