import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 0 a 6: ");
        int valor = scanner.nextInt();

        if (valor == 0) {
            System.out.print("o dia é Domingo");
        } else if (valor == 1) {
            System.out.print("o dia é Segunda-feira");
        } else if (valor == 2) {
            System.out.print("o dia é Terça-feira");
        } else if (valor == 3) {
            System.out.print("o dia é Quarta-feira");
        } else if (valor == 4) {
            System.out.print("o dia é Quinta-feira");
        } else if (valor == 5) {
            System.out.print("o dia é Sexta-feira");
        } else if (valor == 6) {
            System.out.print("o dia é Sabádo");
        }

        scanner.close();
    }
}
