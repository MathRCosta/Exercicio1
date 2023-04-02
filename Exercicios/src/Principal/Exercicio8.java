package Principal;

import javax.swing.JOptionPane;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        int numero1;
        numero1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "digite um numero:")
        );
        int numero2;
        numero2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "digite um numero:")
        );
        JOptionPane.showMessageDialog(null,numero1 + numero2);
    }
}