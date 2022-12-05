package ListaExercicios03;

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Graus em Fahrenheit : ");
        float Fahrenhait = scanner.nextFloat();
        float converFahrenheit = (Fahrenhait - 32) * 5 / 9;
        System.out.print("A converção do Fahrenheit para Celsius é : " + converFahrenheit);

        scanner.close();
    }
}
