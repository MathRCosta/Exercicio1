
package Principal;

import javax.swing.JOptionPane;

public class Exercicio26 {
    
    public static void main(String[] args) {
        
        int i, j;
        int numeros[][] = new int[3][3];
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++){
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros"));
            }
        }
        
        // Letra A
        int resp_a = 0;
        for(i = 0; i < 3;i++){
            resp_a = resp_a + numeros[i][0];
        }
        JOptionPane.showMessageDialog(null, "A soma da primeira coluna é: " + resp_a);
    
    
        // Letra B
        
    
    
    
    }
}
