package ListaExercicios03;

import java.util.*;

public class Exercicio1 {
        // 1) Ler quatro números inteiros e apresentar o resultado da adição e
        // multiplicação,
        // baseando-se na utilização do conceito da propriedade distributiva.
        // Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser
        // somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e
        // por fim C com D.
        // Perceba que será necessário efetuar seis operações de adição e seis operações
        // de multiplicação e apresentar doze resultados de saída.
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor de A: ");
                double a = scanner.nextDouble();
                System.out.print("Digite o valor de B: ");
                double b = scanner.nextDouble();
                System.out.print("Digite o valor de C: ");
                double c = scanner.nextDouble();
                System.out.print("Digite o valor de D: ");
                double d = scanner.nextDouble();

                double adicaoAB = a + b;
                double adicaoAC = a + c;
                double adicaoAD = a + d;
                double multiplicacaoAB = a * b;
                double multiplicacaoAC = a * c;
                double multiplicacaoAD = a * d;

                double adicaoBA = b + a;
                double adicaoBC = b + c;
                double adicaoBD = b + d;
                double multiplicacaoBA = b * a;
                double multiplicacaoBC = b * c;
                double multiplicacaoBD = b * d;

                System.out.print("O resultado da soma de A + B = " + adicaoAB + " o resultado da soma de A + C = "
                                + adicaoAC
                                + " o resultado da soma de A + D = " + adicaoAD);
                System.out.print("O resultado da multiplicação de A * B = " + multiplicacaoAB
                                + " o resultado da multiplicação de A * C = " + multiplicacaoAC
                                + " o resultado da multiplicação de A * D = " + multiplicacaoAD);

                System.out.print("O resultado da soma de B + A = " + adicaoBA + " o resultado da soma de B + C = "
                                + adicaoBC
                                + " o resultado da soma de B + D = " + adicaoBD);
                System.out.print("O resultado da multiplicação de B * A = " + multiplicacaoBA
                                + " o resultado da multiplicação de A * C = " + multiplicacaoBC
                                + " o resultado da multiplicação de A * D = " + multiplicacaoBD);
                scanner.close();
        }
}
