package ListaExercicios5;

import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        // 4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média
        // aritmética simples e escrever uma mensagem que diga se o aluno foi ou não
        // aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
        // Escrever também a média calculada.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.print("Aluno aprovado, nota: " + media);
        } else {
            System.out.print("Aluno reprovado, nota: " + media);
        }

        scanner.close();
    }
}
