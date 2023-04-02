package Principal;

import javax.swing.JOptionPane;

public class Exercicio17 {
    
    public static void main(String[] args) {
        
        
        String profissao;
        
        profissao = JOptionPane.showInputDialog("Qual profissão de tiburcio? \n e- engenheiro \n p- programador \n m- medico \n a- advogado \n d- designer ");
        char profissaoCHAR = profissao.charAt(0);
        
        switch (profissaoCHAR) {
            
            case 'e': 
                
                JOptionPane.showMessageDialog(null,"Tiburcio é engenheiro");
                
                break;
                
            case 'p': 
                
                JOptionPane.showMessageDialog(null,"Tiburcio é programador");
                
                break;
                
            case 'm': 
                
                JOptionPane.showMessageDialog(null,"Tiburcio é médico");
                
                break;
                
            case 'a': 
                
                JOptionPane.showMessageDialog(null,"Tiburcio é advogado");
                
                break;
            
            case 'd': 
                
                JOptionPane.showMessageDialog(null,"Tiburcio é designer");
                
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!!");
                break;
            
            
            
            
            
            
            
        }
      
        
        
        
    }
}

