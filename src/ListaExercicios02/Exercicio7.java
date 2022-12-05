package ListaExercicios02;

import java.util.*;

public class Exercicio7 {
    // 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
    // fórmula: Volume = π*Raio2*Altura
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();
        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.print("O volume é:" + volume);
        scanner.close();
    }
}
