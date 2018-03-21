package classes;

public class TestandoClasseCachorro {

    public static void main(String[] args) {
        
        Cachorro rex = new Cachorro("Rex", 2, "buldogue");
        rex.altura = 50;
        rex.peso = 10;
        
        rex.comer((float) 0.350);
        rex.andar(200);
        rex.correr(500);
        rex.comer((float) 0.800);       
        rex.pular((float) 1.5);
        rex.comer((float) 10.150);
        rex.correr(1500);
        rex.andar(100);
    }
    
}
