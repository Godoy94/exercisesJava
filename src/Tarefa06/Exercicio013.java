package Tarefa06;

import java.util.*;

public class Exercicio013 {
    public static void main(String[] args) {
        // 13. Elaborar um programa que efetue a leitura do nome e do sexo de uma
        // pessoa, apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o
        // sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo
        // informado como feminino. Apresente também junto da mensagem de saudação o
        // nome previamente informado.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu Nome: ");
        String nome = scanner.next();
        System.out.print("Digite o seu Sexo: ");
        String sexo = scanner.next();
        String sexo01 = "Masculino";
        if (sexo.equalsIgnoreCase(sexo01)) {
            System.out.print("Ilmo Sr " + nome + " Muito Prazer");
        } else {
            System.out.print("Ilma Sra." + nome + " Muito Prazer");
        }

        scanner.close();
    }
}
