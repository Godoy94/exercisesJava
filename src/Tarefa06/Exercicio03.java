package Tarefa06;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {

        // 3. Ler quatro valores referentes a quatro notas escolares de um aluno e
        // imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média
        // escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma
        // mensagem informando esta condição. Apresentar junto das mensagens o valor da
        // média do aluno para qualquer condição.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira Nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda Nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Digite a terceira Nota: ");
        float nota3 = scanner.nextFloat();
        System.out.print("Digite a quarta Nota: ");
        float nota4 = scanner.nextFloat();
        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaFinal >= 5) {
            System.out.print("O aluno Foi Aprovado Com a Media : " + mediaFinal);
        } else {
            System.out.print("O aluno foi Reprovado Com a Media : " + mediaFinal);
        }

        scanner.close();
    }
}
