package ListaExercicios01;

import java.util.Scanner;

public class Exercicio011 {
    // 11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior,
    // base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da base maior: ");
        int baseMaior = ler.nextInt();

        System.out.print("Digite o valor da base menor: ");
        int baseMenor = ler.nextInt();

        System.out.print("Digite o valor da altura");
        int altura = ler.nextInt();

        int a = (baseMaior + baseMenor) * altura / 2;

        System.out.print("A área do trapézio é: " + a);
        ler.close();
    }
}
