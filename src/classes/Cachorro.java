package classes;

public class Cachorro {

    public String nome;
    public int idade;
    public String raca;
    public float peso;
    public int altura;
    
    private static final String LABRADOR = "labrador";
    private static final String BULDOGUE = "buldogue";
    private static final String POODLE = "poodle";
    private static final String PUG = "pug";

    private Cachorro() {

    }

    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;

        if (LABRADOR.equalsIgnoreCase(raca) || BULDOGUE.equalsIgnoreCase(raca)
                || PUG.equalsIgnoreCase(raca) || POODLE.equals(raca)) {
            this.raca = raca;
        } else {
            System.out.println("Raca invalida!");
        }
    }
    

    public String latir(int latidos) {

        String latido = "";
        
        if (LABRADOR.equalsIgnoreCase(raca)) {
            latido = "Au, Au ";
        } else if (BULDOGUE.equalsIgnoreCase(raca)) {
            latido = "Woof, Woof ";
        } else if (PUG.equalsIgnoreCase(raca)) {
            latido = "Ruff, Ruff ";
        } else if (POODLE.equalsIgnoreCase(raca)) {
            latido = "Yip, Yip ";
        }

        String mensagem = "";
        for (int cont = 1; cont <= latidos; cont++) {
            mensagem += latido;
        }
        
        return mensagem;

        /*
        for (int cont = 1; cont <= latidos; cont++) {
            if ("labrador".equalsIgnoreCase(raca)) {
                System.out.print("Au, Au ");
            } else if ("buldogue".equalsIgnoreCase(raca)) {
                System.out.print("Woof, Woof ");
            } else if ("pug".equalsIgnoreCase(raca)) {
                System.out.print("Ruff, Ruff ");
            } else if ("poodle".equalsIgnoreCase(raca)) {
                System.out.print("Yip, Yip ");
            }
        }
         */
    }

    private float calcularPesoMaximo() {
        return this.altura / 2;
    }
    
    public void comer(float quantidadeComida) {
        float pesoMaximo = calcularPesoMaximo();
        double pesoMagro = pesoMaximo*0.3;
        double pesoGordo = pesoMaximo*0.7;
        
        if (this.peso + quantidadeComida > pesoMaximo) {
            System.out.println("Se o seu cachorro comer tudo isso, vai explodir!");
        } else {
            this.peso += quantidadeComida;           
            
            if (this.peso < pesoMagro) {
                System.out.println("Seu cachorro esta magricelo!");
            } else if (this.peso >= pesoMagro && this.peso <= pesoGordo) {
                System.out.println("Seu cachorro esta em forma!");                
            } else {
                System.out.println("Seu cachorro esta obeso!");
            }
        }
        
    }

    public void andar() {

    }

    public void correr() {

    }

    public void pular() {

    }
}
