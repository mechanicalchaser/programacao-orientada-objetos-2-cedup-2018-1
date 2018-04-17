package classes;

public class ContaBancaria {

    public String banco;
    public String agencia;
    public String conta;
    public String correntista;
    
    public float saldo;
    public int quantidadeSaques;
    public int quantidadeDepositos;
    
    private ContaBancaria() {
        
    }
    
    public ContaBancaria(String banco, String agencia, String conta, String correntista) {
        
        if (!"Banco do Brasil".equalsIgnoreCase(banco) && 
                !"Caixa".equalsIgnoreCase(banco) && 
                    !"Santander".equalsIgnoreCase(banco)) {
            return;
        }
        
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.correntista = correntista;
        
        
    }
    
}
