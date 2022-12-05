package Tarefa05;

import java.util.*;

public class Exercicio011 {
    public static void main(String[] args) {

        // 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
        // crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo -
        // débito + crédito). Também testar se saldo atual for maior ou igual a zero
        // escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
        // Negativo'.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da Conta: ");
        float contaCliente = scanner.nextFloat();
        System.out.print("Digite o Saldo da Conta - " + contaCliente + " : ");
        float saldoConta = scanner.nextFloat();
        System.out.print("Digite o Seu Debito: ");
        float debitoConta = scanner.nextFloat();
        System.out.print("Digite o seu credito Disponivel: ");
        float creditoConta = scanner.nextFloat();
        float saldoAtual = (saldoConta - debitoConta) + creditoConta;
        System.out.print("Cliente : " + contaCliente);
        System.out.print("Saldo da Conta : R$" + saldoConta);
        System.out.print("Debito da Conata: R$" + debitoConta);
        if (saldoAtual >= 0) {
            System.out.print("O saldo da Conta " + contaCliente + " e POSITIVA.");
        } else {
            System.out.print("O saldo da conta " + contaCliente + " e NEGATIVA");
        }

        scanner.close();
    }
}
