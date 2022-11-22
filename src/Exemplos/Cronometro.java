import java.util.*;

public class Cronometro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        for (int k = horas; k >= 0; k--) {
            for (int i = minutos; i >= 0; i--) {
                for (int j = segundos; j >= 0; j--) {
                    System.out.println(k + " : " + i + " : " + j);
                    segundos = 59;
                    minutos = 59;
                }
            }
        }

        scanner.close();
    }
}
