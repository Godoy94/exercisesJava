package ListaExercicios3;

import java.util.*;

public class Exercicio7 {
    // 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
    // fórmula: Volume = π*Raio2*Altura

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite Altura da Lata de Oleo : ");
        double altura = scanner.nextDouble();
        System.out.print("Digite Raio da Lata de Oleo : ");
        double raio = scanner.nextDouble();
        double volumeLata = Math.PI * (raio * raio) * altura;
        System.out.print("O volume da Lat de oleo é : " + volumeLata);

        scanner.close();
    }
}
