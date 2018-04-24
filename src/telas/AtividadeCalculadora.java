package telas;

import javax.swing.JOptionPane;

public class AtividadeCalculadora {

    public static void main(String[] args) {
        
        Object[] operacoes = {"+", "-", "*", "/"};

        String operacao = (String) JOptionPane.showInputDialog(null, 
                "Selecione a operacao:", 
                "Calculadora", JOptionPane.QUESTION_MESSAGE, null,
                operacoes, null);
        
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite o primeiro numero:"));

        float numero2;
        
        do {            

            numero2 = Float.parseFloat(JOptionPane.showInputDialog(null, 
                    "Digite o segunto numero:"));            
            
        } while( operacao.equals("/") && numero2 == 0 );
        
        float resultado = 0;
        
        switch (operacao) {
            case "+" : 
                resultado = numero1 + numero2;
                break;
            case "-" :
                resultado = numero1 - numero2;
                break;
            case "*" :
                resultado = numero1 * numero2;
                break;
            case "/" :
                resultado = numero1 / numero2;
                break;                
        }

        JOptionPane.showMessageDialog(null, 
                numero1 + operacao + numero2 + " = " + resultado);
        
    }
    
}
