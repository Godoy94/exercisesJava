package Tarefa08;

import java.util.*;

public class Exercicio011 {
    public static void main(String[] args) {
        // 11) Elaborar um programa que possibilite calcular a área total de uma
        // residência
        // (sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.).
        // O programa deve solicitar a entrada do nome, a largura e o comprimento de um
        // determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e
        // também uma
        // mensagem solicitando do usuário a confirmação de continuar calculando novos
        // cômodos.
        // Caso o usuário responda “NAO”, o programa deve apresentar o valor total
        // acumulado da área residencial.

        Scanner scanner = new Scanner(System.in);
        String nome;
        float largura, comprimento, area, soma = 0;
        char continuar;
        do {
            System.out.print("Digite o nomo do comodo: ");
            nome = scanner.nextLine();
            System.out.print("Digite o comprimento do comodo: ");
            comprimento = scanner.nextFloat();
            System.out.print("Digite a largura do comodo: ");
            largura = scanner.nextFloat();
            area = largura * comprimento;
            System.out.print("A área do comodo " + nome + " é: " + area);
            System.out.print("Deseja continuar calculando? (s: sim/n: não): ");
            continuar = scanner.next().charAt(0);
            soma = soma + area;
            scanner.nextLine();
        } while (continuar != 'n');
        System.out.print("A soma das areas dos comodos lidos é: " + soma);

        scanner.close();

    }
}
