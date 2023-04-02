package Principal;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int resultado;
        
        int numero1 = Integer.parseInt(
        JOptionPane.showInputDialog("Digite um numero: ")
        );
        int numero2 = Integer.parseInt(
         JOptionPane.showInputDialog(null,"Digite outro: " )
        );
        resultado = numero1 + numero2;
        if (resultado > 10) {
         JOptionPane.showMessageDialog(null, "o resultado é: " +resultado);
            
        }
    }
}
