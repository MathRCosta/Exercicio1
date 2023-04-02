package Principal;

import javax.swing.JOptionPane;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        double salario, prestacao;
        
        salario = Double.parseDouble(
                                JOptionPane.showInputDialog(null,"Digite seu Salario: ")
        );
        prestacao = Double.parseDouble(
                                JOptionPane.showInputDialog(null,"Digite a prestacao: ")
        );
        
        if (prestacao <= 0.3 * salario) {
            JOptionPane.showMessageDialog(null, "O emprestimo pode ser concedido.");
            
        }else{
            if (prestacao > 0.3 * salario) {
                JOptionPane.showMessageDialog(null, "O emprestimo não pode ser concedido.");
            }
        }
        
        
           
    }
}