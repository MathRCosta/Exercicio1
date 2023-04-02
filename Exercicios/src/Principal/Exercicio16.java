package Principal;

import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {

        double a, b, resultado;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));

        int controle;
        controle = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Qual operação deseja realizar? \n 1- adição \n 2- subtração \n 3- multiplicação \n 4- divisão")
        );

        switch (controle) {

            case 1:
                resultado = a + b;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

            case 2:
                resultado = a - b;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

            case 3:
                resultado = a * b;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

            case 4:
                resultado = a / b;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!!");
                break;
        }

    }

}
