package Tarefa07;

import java.util.*;

public class Exercicio014 {
    public static void main(String[] args) {

        // 14) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3
        // verificações e a média dos exercícios que fazem parte da avaliação. Calcular
        // a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do
        // aluno de acordo com a tabela de conceitos mais abaixo:
        // A atribuição de conceitos obedece a tabela abaixo:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Aluno: ");
        String nomeAluno = scanner.next();

        System.out.print("Digite a primeira nota do Aluno (" + nomeAluno + ") :");
        float nota01 = scanner.nextFloat();
        System.out.print("Digite a segunda nota do Aluno (" + nomeAluno + ") :");
        float nota02 = scanner.nextFloat();
        System.out.print("Digite a terceira nota do Aluno (" + nomeAluno + ") :");
        float nota03 = scanner.nextFloat();

        float mediasDasAvaliacoes = (nota01 + nota02 + nota03) / 3;
        float media_de_Aproveitamento = (nota01 + (nota02 * 2) + (nota03 * 3) + mediasDasAvaliacoes) / 7;

        if (media_de_Aproveitamento >= 9.00f) {
            System.out.print("A media de Aproveitamento do Aluno (" + nomeAluno + ") : " + media_de_Aproveitamento);
            System.out.print("Conceito : A");
        } else if (media_de_Aproveitamento >= 7.50f && media_de_Aproveitamento < 9.00f) {
            System.out.print("A media de Aproveitamento do Aluno (" + nomeAluno + ") : " + media_de_Aproveitamento);
            System.out.print("Conceito : B");
        } else if (media_de_Aproveitamento >= 6.00f && media_de_Aproveitamento < 7.50f) {
            System.out.print("A media de Aproveitamento do Aluno (" + nomeAluno + ") : " + media_de_Aproveitamento);
            System.out.print("Conceito : C");
        } else if (media_de_Aproveitamento < 6.00f) {
            System.out.print("A media de Aproveitamento do Aluno (" + nomeAluno + ") : " + media_de_Aproveitamento);
            System.out.print("Conceito : D");
        }

        scanner.close();
    }
}
