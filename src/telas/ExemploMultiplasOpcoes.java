package telas;

import javax.swing.JOptionPane;

public class ExemploMultiplasOpcoes {

    public static void main(String[] args) {
        
        int numero = (int) Math.ceil(Math.random()*10);
        
        Object[] opcoes = {"0","1","2","3","4","5","6","7","8","9","10"};
        
        String resposta = "";
        
        while (true) {
            
            resposta = (String) JOptionPane.showInputDialog(null, 
                    "Em que numero eu estou pensando?", 
                    "Jogo de Adivinhar", JOptionPane.QUESTION_MESSAGE, null,
                    opcoes, null);
            
            if (resposta == null) {
                JOptionPane.showMessageDialog(null, "Game over!\nVoce desistiu do jogo!");
                break;
            } else if (Integer.parseInt(resposta) > numero) {
                JOptionPane.showMessageDialog(null, "Errado!\nO numero que eu pensei eh menor!");
            } else if (Integer.parseInt(resposta) < numero) {
                JOptionPane.showMessageDialog(null, "Errado!\nO numero que eu pensei eh maior!");
            } else {
                JOptionPane.showMessageDialog(null, "Parabens!\nVoce adivinhou!\nEu realmente pensei no numero " + numero + "!");
                break;
            }
            
        }
        
    }
    
}
