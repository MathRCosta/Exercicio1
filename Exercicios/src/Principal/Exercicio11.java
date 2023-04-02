package Principal;

import javax.swing.JOptionPane;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(
        JOptionPane.showInputDialog("Digite um numero:"));
        if ((numero % 2) == 0) {
            JOptionPane.showMessageDialog(null,"este numero é divisivel por 2!");
          
        }else{
            JOptionPane.showMessageDialog(null, "não é multiplo");
        }
    }
}