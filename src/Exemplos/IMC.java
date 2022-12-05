import java.util.*;
import java.lang.Math;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();

        System.out.print("Digite seu peso");
        float peso = scanner.nextFloat();

        double imc = peso / Math.pow(altura, 2);

        if (imc <= 18.5) {
            System.out.print(imc + " Magreza");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.print(imc + " Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.print(imc + " Sobrepeso");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.print(imc + " Obesidade 1");
        } else {
            System.out.print(imc + " Obesidade grave");
        }

        scanner.close();
    }
}
