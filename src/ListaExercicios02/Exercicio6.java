package ListaExercicios02;

import java.util.Scanner;

public class Exercicio6 {
    // 6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus
    // Celsius.
    // A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e
    // C a temperatura em Celsius.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        double conversaoCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        System.out.print("A temperatura em Fahrenheit convertida em Celsius é: " + conversaoCelsius + "ºC");
        scanner.close();
    }
}
