package Tarefa07;

import java.util.*;;

public class Exercicio011 {
    public static void main(String[] args) {

        // 11) Uma fruteira está vendendo frutas com a seguinte tabela de preços:
        // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
        // ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
        // Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
        // (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Morangos: ");
        float morangosKG = scanner.nextFloat();
        System.out.print("Digite a quantidade de Maças: ");
        float macaKG = scanner.nextFloat();

        if (morangosKG <= 5 && macaKG <= 5) {
            float morangoValorAte5Kg = morangosKG * 2.50f;
            float macaValorAte5Kg = macaKG * 1.80f;
            float somaValorFinalDasFruts = morangoValorAte5Kg + macaValorAte5Kg;
            System.out.print("Valor total da Compra foi: " + somaValorFinalDasFruts);

            if (somaValorFinalDasFruts > 25 && morangosKG + macaKG > 8) {
                float somaValorFinalDasFrutasMas10 = 10 * somaValorFinalDasFruts / 100;
                float somaFinalMas10 = somaValorFinalDasFruts - somaValorFinalDasFrutasMas10;
                System.out.print("Valor total da compra foi: " + somaFinalMas10);
            }

        } else if (morangosKG > 5 && macaKG > 5) {
            float morangoValorAcimaDe5Kg = morangosKG * 2.20f;
            float macaValorAcimaDe5Kg = macaKG * 1.50f;
            float somaValorFinalDasFruts02 = morangoValorAcimaDe5Kg + macaValorAcimaDe5Kg;
            System.out.print("Valor total da Compra foi: " + somaValorFinalDasFruts02);

            if (somaValorFinalDasFruts02 > 25 && morangosKG + macaKG > 8) {
                float somaValorMas10_02 = 10 * somaValorFinalDasFruts02 / 100;
                float somaValorFinal02 = somaValorFinalDasFruts02 - somaValorMas10_02;
                System.out.print("Valor total da Compra foi: " + somaValorFinal02);
            }
        }

        scanner.close();
    }
}
