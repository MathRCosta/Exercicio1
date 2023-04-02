package Principal;

import javax.swing.JOptionPane;

public class Exercicio9 {
    
    public static void main(String[] args) {
    
        Double peso;
        peso = Double.parseDouble(
                JOptionPane.showInputDialog(null,"Digite seu peso (Kg):")
        );
        double altura;
        altura = Double.parseDouble(
                  JOptionPane.showInputDialog(null, "Digite sua altura (metros):")  
        );
        JOptionPane.showMessageDialog(null, peso / (altura * altura ));
    }
}