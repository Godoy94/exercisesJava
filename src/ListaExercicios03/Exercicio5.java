package ListaExercicios03;

import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        // 5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
        // Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura
        // em Fahrenheit e C a temperatura em Celsius

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit : ");
        float celsius = scanner.nextFloat();
        float fahrenheit = (9 * celsius + 160) / 5;
        System.out.print("A temperatura em Celsius convertida em Fahrenheit é : " + fahrenheit);

        scanner.close();
    }
}
