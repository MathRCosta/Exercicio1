package Principal;

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {

        int numero1;
        numero1 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um numero:"));
        int numero2;
        numero2 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um numero:"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1);
        } else {
            if (numero2 > numero1) {
                JOptionPane.showMessageDialog(null, numero2);

            } else {
                if (numero2 == numero1) {
                    JOptionPane.showMessageDialog(null, "Os numero são iguais!");
                }
            }

        }
    }
}
