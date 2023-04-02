package Principal;

import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {

        int nascimento;
        int atual;
        
        
        nascimento = Integer.parseInt(
                JOptionPane.showInputDialog("Digite sua data de nascimento:")
        );
        atual = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o ano atual:")
        );

        if (atual < nascimento) {
            JOptionPane.showMessageDialog(null, "Erro");

        } else {
            if (nascimento < atual) {
                JOptionPane.showMessageDialog(null, "Sua idade é:" + (atual - nascimento));
            }
            
            
            
        }
            
    }
   
    
}