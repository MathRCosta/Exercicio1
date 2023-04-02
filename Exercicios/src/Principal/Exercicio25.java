package Principal;

import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {

        int i, flag;
        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de pessoas a ser cadastrado:"));

        String nomePessoas[] = new String[numPessoas];
        for (i = 0; i < numPessoas; i++) {
            nomePessoas[i] = JOptionPane.showInputDialog("Digite os nomes:");
        }

        flag = 0;
        String nomePesquisar = JOptionPane.showInputDialog("Qual nome quer pesquisar? ");
        for (i = 0; i < numPessoas; i++) {
            if (nomePessoas[i].equalsIgnoreCase(nomePesquisar)) {
                JOptionPane.showMessageDialog(null, "O nome foi encontrado na posicao " + i);
                flag = 1;
            }
        }
        if (flag <= 0) {
            JOptionPane.showMessageDialog(null, "O nome nao foi encontrado");
        }
    }
}
