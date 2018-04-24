package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExemploJanelaJFrame {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Aplicacao");
        janela.setSize(800, 600);
        
        JPanel panel = new JPanel();
        janela.setContentPane(panel);
        
        JLabel labelNome = new JLabel();
        labelNome.setText("Nome: ");        
        panel.add(labelNome);
        
        JTextField campoNome = new JTextField(40);
        panel.add(campoNome);
        
        JPasswordField campoSenha = new JPasswordField(40);
        panel.add(campoSenha);
        
        JTextArea campoObservacao = new JTextArea(20,40);
        panel.add(campoObservacao);
        
        JCheckBox opcao01 = new JCheckBox("Opcao 01");
        JCheckBox opcao02 = new JCheckBox("Opcao 02");
        panel.add(opcao01);
        panel.add(opcao02);
        
        String[] itens = new String[3];
        itens[0] = "Lucas";
        itens[1] = "Joao";
        itens[2] = "Pedro";
        
        JComboBox combobox = new JComboBox(itens);
        panel.add(combobox);
        
        JButton botaoConfirmar = new JButton("Confirmar");
        JButton botaoCancelar = new JButton("Cancelar");
        
        botaoConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(botaoConfirmar, campoNome.getText());
            }
        });
        
        panel.add(botaoConfirmar);
        panel.add(botaoCancelar);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        janela.setVisible(true);
        
    }
    
}
