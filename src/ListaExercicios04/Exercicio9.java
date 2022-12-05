package ListaExercicios04;

import java.util.*;

public class Exercicio9 {
    public static void main(String[] args) {
        // 9) Ler o valor correspondente ao salário mensal (variável SM) de um
        // trabalhador
        // e também o valor do percentual de reajuste (variável PR) a ser atribuído.
        // Apresentar o valor do novo salário (variável NS).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mensal:");
        float salarioMensal = scanner.nextFloat();

        System.out.print("Digite o valor da porcentagem de reajuste.");
        float porcetagemReajuste = scanner.nextFloat();

        float novoSalario = salarioMensal / 100 * porcetagemReajuste + salarioMensal;

        System.out.print("Após o reajuste seu novo salário é de: R$" + novoSalario);
        scanner.close();
    }
}
