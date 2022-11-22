package ListaExercicios2;

import java.util.Scanner;

public class Exercicio5 {
    // 5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
    // Fahrenheit.
    // A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em
    // Fahrenheit e C a temperatura em Celsius.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Graus Celsius: ");
        double grausCelsius = scanner.nextDouble();
        double conversaoFahrenheit = (9 * grausCelsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + conversaoFahrenheit + "ºF");
        scanner.close();
    }
}