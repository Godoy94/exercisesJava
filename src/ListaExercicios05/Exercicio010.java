package ListaExercicios05;

import java.util.*;

public class Exercicio010 {
    public static void main(String[] args) {

        // 10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
        // empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
        // vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e
        // escrever o seu salário total.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário fixo");
        float salarioFixo = scanner.nextFloat();

        System.out.print("Digite o valor de vendas efetuado pelo usuário :");
        float valorVendas = scanner.nextFloat();

        if (valorVendas < 1501) {
            float salarioFinal = valorVendas / 100 * 3 + salarioFixo;
            System.out.print("O salario Final é: R$ " + salarioFinal);
        } else {
            float salarioFinal02 = (valorVendas - 1500) * 5 / 100 + (1500 * 3 / 100) + salarioFixo;
            System.out.print("O salário final do é: R$ " + salarioFinal02);
        }
        scanner.close();
    }
}
