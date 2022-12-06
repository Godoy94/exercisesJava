package Tarefa09;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1) Apresentar os quadrados dos números inteiros de 15 a 200.
        int numero = 15;
        do {
            System.out.println(numero * numero);
            numero++;
        } while (numero <= 200);
    }
}
