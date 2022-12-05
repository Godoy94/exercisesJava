package ListaExercicios05;

import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        // 8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere
        // apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
        // sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo
        // pode iniciar em um dia e terminar no dia seguinte.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora do inicio: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora do fim: ");
        int horaFim = scanner.nextInt();

        int resultaDoJogo = horaFim - horaInicio;

        if (resultaDoJogo > 0) {
            System.out.print("A partida de Xadrez durou " + resultaDoJogo + " Horas ");
        } else {
            int resultadoDoJogoAcabadoNoDiaSeguinte = resultaDoJogo + 24;
            System.out.print("A partida de Xadrez Durou " + resultadoDoJogoAcabadoNoDiaSeguinte + " Horas ");
        }

        scanner.close();
    }
}
