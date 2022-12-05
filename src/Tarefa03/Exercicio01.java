package Tarefa03;

import java.util.Scanner;

public class Exercicio01 {
    // 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
    // dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
    // com 365 dias e mês com 30 dias. D<-(D+(a*365)+(m*30))

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quantos anos voce tem: ");
        int anos = ler.nextInt();

        System.out.print("Digite a quantidade de meses voce tem: ");
        int meses = ler.nextInt();

        System.out.print("Digite a quantidade de dias voce tem: ");
        int dias = ler.nextInt();

        int calculo = (dias + (anos * 365) + (meses * 30));

        System.out.print("Voce tem: " + calculo + " Dias");
        ler.close();
    }
}
