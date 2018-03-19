package classes;

public class Carro {

    private String marca;
    public String modelo;
    public int anoFabricacao;
    public int quantidadePortas;
    public boolean temFreioABS;
    public boolean cambioAutomatico;
    public int velocidadeMaxima;
    public float valorOriginal;

    public boolean ligado;
    public int velocidade;
    public int marcha;

    private Carro() {
        
    }
    
    public Carro(String marcaInformada, String modeloInformado, int anoFabricacaoInformado) {
        this.marca = marcaInformada;
        this.modelo = modeloInformado;
        this.anoFabricacao = anoFabricacaoInformado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
    }

    public void acelerar(int aceleracao) {
        velocidade += aceleracao;
    }

    public void frear(int aceleracao) {
        velocidade -= aceleracao;
    }

    public void trocarMarcha(int marcha) {
        this.marcha = marcha;
    }

    public float calcularValorFIPE() {
        return 0;
    }
}
