package Tarefa10;

import javax.swing.*;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
         * 7) Apresentar os resultados das potências de 3, variando do expoente 0 até o
         * expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e
         * elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado
         * o operador de exponenciação do portuguol (^).
         */
        String total = "";
        int i;
        int n3 = 3;

        for (i = 1; i <= 15; i++) {
            if (i == 1) {
                total += "3 elevado a " + i + " é " + n3 + "\n";
                i++;
            }
            n3 *= 3;
            total += "3 elevado a " + i + " é " + n3 + "\n";
        }
        JOptionPane.showMessageDialog(null, total, "RESULTADO", JOptionPane.PLAIN_MESSAGE);
    }
}
