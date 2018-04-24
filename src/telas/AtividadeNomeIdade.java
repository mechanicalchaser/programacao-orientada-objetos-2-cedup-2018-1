package telas;

import javax.swing.JOptionPane;

public class AtividadeNomeIdade {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome:");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade:"));
        
        String mensagem = "Nome completo: ".concat(nome)
                .concat(" ").concat(sobrenome);
        
        if (idade >= 18) {
            mensagem = mensagem.concat("\nVoce eh maior de idade!");
        } else {
            mensagem = mensagem.concat("\nVoce eh menor de idade!");
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
