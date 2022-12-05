package Tarefa07;

import java.util.*;

public class Exercicio015 {
    public static void main(String[] args) {
        // 15) Uma empresa quer verificar se um empregado está qualificado
        // para a aposentadoria ou não. Para estar em condições, um dos seguintes
        // requisitos
        // deve ser satisfeito:
        // - Ter no mínimo 65 anos de idade.
        // - Ter trabalhado no mínimo 30 anos.
        // - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
        // Com base nas informações acima, faça um algoritmo que leia:
        // o número do empregado (código), o ano de seu nascimento e o ano de seu
        // ingresso na empresa.
        // O programa deverá escrever a idade e o tempo de trabalho do empregado e a
        // mensagem
        // 'Requerer aposentadoria' ou 'Não requerer'.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo do empregado: ");
        int codigoVerificacao = scanner.nextInt();
        String codigoVerificacaoString = "";
        switch (codigoVerificacao) {
            case 1:
                codigoVerificacaoString = "MATHEUS";
                break;
            case 2:
                codigoVerificacaoString = "JOÃO";
                break;
            case 3:
                codigoVerificacaoString = "NILTON";
                break;
            case 4:
                codigoVerificacaoString = "LUAN";
                break;
            case 5:
                codigoVerificacaoString = "THIAGO";
                break;
            default:
                System.out.print("Codigo Invalido");
        }
        System.out.print(codigoVerificacaoString);
        System.out.print("Digite a data de nascimento do " + codigoVerificacaoString + " : ");
        int dataNascimento = scanner.nextInt();
        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();
        System.out.print("Digite o ano de saida: ");
        int anoSaida = scanner.nextInt();

        int idadeDoCliente = 2022 - dataNascimento;
        int anosPrestacao = anoSaida - anoIngresso;

        if (idadeDoCliente >= 65) {
            System.out.print("Requerer aposentadoria para (" + codigoVerificacaoString + ") OK");
        } else if (anosPrestacao >= 30) {
            System.out.print("Requerer aposentadoria para (" + codigoVerificacaoString + ") OK");
        } else if (idadeDoCliente >= 60 && anosPrestacao >= 25) {
            System.out.print("Requerer aposentadoria para (" + codigoVerificacaoString + ") OK");
        } else {
            System.out.print("Não requerer aposentadoria para(" + codigoVerificacaoString + ")");
        }

        scanner.close();
    }
}
