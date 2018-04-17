package telas;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int resposta = JOptionPane.showConfirmDialog(null, 
                "Seu nome eh " + nome + "?");
        
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ola, " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Ops, seu nome nao eh " + nome);
        }

    }
    
}
