package ListaExercicios02;

import java.util.Scanner;

public class Exercicio3 {
    // 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o
    // percentual de reajuste.
    // Calcular e escrever o valor do novo salário.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário mensal (R$): ");
        double salarioMensal = scanner.nextDouble();

        System.out.print("Digite a porcentagem do reajuste salarial (%): ");
        double porcentagemReajuste = scanner.nextDouble();

        double calculoReajuste = salarioMensal * (porcentagemReajuste / 100);
        double salarioReajustado = salarioMensal + calculoReajuste;
        System.out.print(salarioReajustado);

        scanner.close();
    }
}
