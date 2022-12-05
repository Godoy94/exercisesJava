package Tarefa07;

import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {
        // 6) Ler o nome de 2 times e o número de gols marcados na partida (para cada
        // time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser
        // impressa a palavra EMPATE.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro Time: ");
        String time01 = scanner.next();
        System.out.print("Digite o nome do segundo Time: ");
        String time02 = scanner.next();
        System.out.print("Digite o numero de gols marcado pelo o primeiro time: ");
        int golsTime01 = scanner.nextInt();
        System.out.print("Digite o numero de gols marcado pelo o segundo Time: ");
        int golstime02 = scanner.nextInt();
        if (golsTime01 > golstime02) {
            System.out.print("O time " + time01 + " Ganhou a partida.");
            System.out.print("O placar foi " + time01 + golsTime01 + " X " + golstime02 + time02);
        } else if (golstime02 > golsTime01) {
            System.out.print("O time " + time02 + " Ganhou a partida.");
            System.out.print("O placar foi " + time02 + golstime02 + " X " + golsTime01 + time01);
        } else if (golsTime01 == golstime02) {
            System.out.print("Os times empataram a partida.");
            System.out.print("O placar foi " + time02 + golstime02 + " X " + golsTime01 + time01);
        }

        scanner.close();
    }
}
