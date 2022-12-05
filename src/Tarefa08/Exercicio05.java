package Tarefa08;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        String total = "";
        int i;
        int n3 = 3;

        for (i = 1; i <= 15; i++) {
            if (i == 1) {
                total += "3 elevado a " + i + " � " + n3 + "\n";
                i++;
            }
            n3 *= 3;
            total += "3 elevado a " + i + " � " + n3 + "\n";
        }
        JOptionPane.showMessageDialog(null, total, "RESULTADO", JOptionPane.PLAIN_MESSAGE);
    }
}
