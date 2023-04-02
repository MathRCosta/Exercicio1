package Principal;

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade:"));

        if (idade < 15) {
            JOptionPane.showMessageDialog(null, "NAO ACEITA");
        } else {
                if ( idade > 25) {
                    JOptionPane.showMessageDialog(null, "NAO ACEITA");
                } else { 
                       if ( idade >= 15 ) {
                            JOptionPane.showMessageDialog(null, "ACEITA");
                        } else {
                                if ( idade <= 25) {
                                    JOptionPane.showMessageDialog(null, "ACEITA");
    } 
                       } 
                }
        }
    }

}