package classes;

public class TestandoClasse {

    public static void main(String[] args) {
        
        Carro carroHerbie = new Carro("Volkswagen", "Fusca", 1953);

        carroHerbie.quantidadePortas = 2;
        carroHerbie.temFreioABS = false;
        carroHerbie.cambioAutomatico = false;
        carroHerbie.velocidadeMaxima = 110;
        carroHerbie.valorOriginal = 375000;
        carroHerbie.ligado = false;
        carroHerbie.velocidade = 0;
        carroHerbie.marcha = 0;
        
        System.out.println("Marca: " + carroHerbie.getMarca());
        System.out.println("Modelo: " + carroHerbie.modelo);
        System.out.println("Ano: " + carroHerbie.anoFabricacao);
        System.out.println("Ligado: " + carroHerbie.ligado);
        System.out.println("Velocidade: " + carroHerbie.velocidade);
        System.out.println("Marcha: " + carroHerbie.marcha);
        System.out.println("-------------------------------------");
        
        carroHerbie.ligar();
        System.out.println("Ligado: " + carroHerbie.ligado);
        System.out.println("Velocidade: " + carroHerbie.velocidade);
        System.out.println("Marcha: " + carroHerbie.marcha);
        System.out.println("-------------------------------------");
        
        carroHerbie.trocarMarcha(2);
        carroHerbie.acelerar(80);
        System.out.println("Ligado: " + carroHerbie.ligado);
        System.out.println("Velocidade: " + carroHerbie.velocidade);
        System.out.println("Marcha: " + carroHerbie.marcha);
        System.out.println("-------------------------------------");
        
    }
    
}












