package ListaExercicios05;

import java.util.*;

public class Exercicio9 {
    public static void main(String[] args) {

        // 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O
        // funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo
        // é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que
        // leia o número de horas trabalhadas em um mês, o salário por hora e escreva o
        // salário total do funcionário, que deverá ser acrescido das horas extras, caso
        // tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de horas Trabalhada no mes: ");
        float horasTrabalhadas = scanner.nextFloat();

        System.out.print("Digite o Valor ganho Por hora: ");
        float valorGanhoPorHora = scanner.nextFloat();

        if (horasTrabalhadas > 160) {
            float valorExtra = (horasTrabalhadas - 160) * (horasTrabalhadas) + (valorGanhoPorHora * 50 / 100);
            float valorSalarioComExtra = (160 * valorGanhoPorHora) + valorExtra;
            System.out.print(valorSalarioComExtra);
        } else {
            float SalarioSemHoraExtra = valorGanhoPorHora * 160;
            System.out.print(SalarioSemHoraExtra);
        }
        scanner.close();
    }
}
