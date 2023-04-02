package Principal;

import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {

        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome:");

        double preco;
         preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));

        String controle;
        double resultado;
       
       
        
        controle = JOptionPane.showInputDialog("Qual a categoria do produto?" + "\n a, b, c, d, ou e?");
        char controleCHAR = controle.charAt(0);
        
        switch (controleCHAR) {

            /* PERGUNTAR PRO PROFESSOR QUANDO EU DEVO FAZER A CONVERSAO DE STRING PRA DOUBLE */
            
            case 'a': resultado = preco * 0.10;
                      JOptionPane.showMessageDialog(null, "Então " + nome);
                      JOptionPane.showMessageDialog(null, "O preço do produto vai ficar: " + resultado );
                break;
            
            
            case 'b': resultado = preco * 0.15;
                      JOptionPane.showMessageDialog(null, "Então " + nome);
                      JOptionPane.showMessageDialog(null, "O preço do produto vai ficar: " + resultado );
                break;
            
            
            case 'c': resultado = preco * 0.20;
                      JOptionPane.showMessageDialog(null,"Então " + nome);
                      JOptionPane.showMessageDialog(null,"O preço do produto vai ficar: " + resultado );
                break;
            
            
            case 'd': resultado = preco * 0.25;
                      JOptionPane.showMessageDialog(null,"Então " + nome);
                      JOptionPane.showMessageDialog(null,"O preço do produto vai ficar: " + resultado );
                break;
            
            
            case 'e': resultado = preco * 0.50;
                      JOptionPane.showMessageDialog(null,"Então " + nome);
                      JOptionPane.showMessageDialog(null,"O preço do produto vai ficar: " + resultado );
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!!");
                break;
            
            
            
            
            
            
        
                    
        }
    }

}