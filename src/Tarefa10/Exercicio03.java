package Tarefa10;

import javax.swing.*;

public class Exercicio03 {
    /*
     * 3) Apresentar o total da soma obtida dos cem primeiros números inteiros
     * (1+2+3+4+...+98+99+100).
     */

    public static void main(String args[]) {
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "Somatório:" + soma);
    }
}
