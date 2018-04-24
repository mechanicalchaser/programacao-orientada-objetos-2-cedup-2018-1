package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AtividadeLogin {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Aplicacao");
        janela.setSize(800, 600);
        
        JPanel panel = new JPanel();
        janela.setContentPane(panel);
        
        JLabel labelUsuario = new JLabel("Usuario:");
        panel.add(labelUsuario);
        
        JTextField campoUsuario = new JTextField(20);
        panel.add(campoUsuario);
        
        JLabel labelSenha = new JLabel("Senha:");
        panel.add(labelSenha);
        
        JPasswordField campoSenha = new JPasswordField(20);
        panel.add(campoSenha);
        
        JButton botaoConfirmar = new JButton("Confirmar");
        botaoConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String usuario = campoUsuario.getText();
                String senha = campoSenha.getText();
                
                if (usuario.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(botaoConfirmar, 
                            "Campos estao vazios!");
                } else if (usuario.length() < 5 || senha.length() < 3) {
                    JOptionPane.showMessageDialog(botaoConfirmar, 
                            "Usuario ou senha faltando caracteres!");                                        
                } else {
                    JOptionPane.showMessageDialog(botaoConfirmar, 
                            "Usuario e senha informados corretamente!");
                }               
                                
            }
        });
        panel.add(botaoConfirmar);
        
        JButton botaoCancelar = new JButton("Cancelar");
        panel.add(botaoCancelar);        
        
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        janela.setVisible(true);
        
    }
    
}
