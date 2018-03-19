package classes;

public class TestandoClasseCachorro {

    public static void main(String[] args) {
        
        Cachorro rex = new Cachorro("Rex", 2, "pug");
        rex.altura = 20;
        rex.peso = 2;
        
        String latido = rex.latir(5);
        System.out.println(latido);

        System.out.println(rex.peso);
        rex.comer((float) 0.5);
        System.out.println(rex.peso);
        
    }
    
}
