package ListaExercicios02;

import java.util.Scanner;

public class Exercicio2 {
    // 2) Escreva um algoritmo para ler o número total de eleitores de um município,
    // o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
    // que cada um representa em relação ao total de eleitores.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de eleitores do municipo: ");
        double qtdEleitores = ler.nextDouble();

        System.out.print("Digite a quantidade de votos brancos: ");
        double votosBrancos = ler.nextDouble();

        System.out.print("Digite a quantidade de votos nulos: ");
        double votosNulos = ler.nextDouble();

        double votosValidos = qtdEleitores - votosBrancos - votosNulos;

        double porcentagemVotosBrancos = (votosBrancos * 100) / qtdEleitores;
        double porcentagemVotosNulos = (votosNulos * 100) / qtdEleitores;
        double porcentagemVotosValidos = (votosValidos * 100) / qtdEleitores;

        System.out.print("\nPorcentagem de votos brancos: " + porcentagemVotosBrancos + "% \n");
        System.out.print("Porcentagem de votos nulos: " + porcentagemVotosNulos + "% \n");
        System.out.print("Porcentagem de votos válidos: " + porcentagemVotosValidos + "% ");
        ler.close();
    }
}
