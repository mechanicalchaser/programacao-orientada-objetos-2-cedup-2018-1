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
    }

    private float calcularPesoMaximo() {
        return this.altura / 2;
    }

    public void comer(float quantidadeComida) {
        float pesoMaximo = calcularPesoMaximo();
        double pesoMagro = pesoMaximo * 0.3;
        double pesoGordo = pesoMaximo * 0.7;

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

    public void andar(float distanciaPercorrida) {

        if (this.peso < calcularPesoMaximo() * 0.3) {
            System.out.println("Seu cachorro esta com peso abaixo de 30%, "
                    + "nao pode andar.");
            return;
        }
        
        float pesoPerdido = (float) (calcularPesoMaximo()*0.001);
        float quantidadePercorrido = distanciaPercorrida / 100;
        float pesoTotalPerdido = pesoPerdido * quantidadePercorrido;
        
        if (this.peso - pesoTotalPerdido < calcularPesoMaximo()*0.15) {
            System.out.println("Seu cachorro vai ficar com peso abaixo de "
                    + "15%, nao pode andar.");
            return;
        }
        
        this.peso = this.peso - pesoTotalPerdido;
        
        float pesoMaximo = calcularPesoMaximo();
        double pesoMagro = pesoMaximo * 0.3;
        double pesoGordo = pesoMaximo * 0.7;

        if (this.peso < pesoMagro) {
            System.out.println("Seu cachorro ficou magricelo!");
        } else if (this.peso >= pesoMagro && this.peso <= pesoGordo) {
            System.out.println("Seu cachorro continua em forma!");
        } else {
            System.out.println("Seu cachorro continua obeso!");
        }

    }

    public void correr(float distanciaPercorrida) {

        if (this.peso < calcularPesoMaximo() * 0.3) {
            System.out.println("Seu cachorro esta com peso abaixo de 30%, "
                    + "nao pode andar.");
            return;
        }
        
        float pesoPerdido = (float) (calcularPesoMaximo()*0.0025);
        float quantidadePercorrido = distanciaPercorrida / 100;
        float pesoTotalPerdido = pesoPerdido * quantidadePercorrido;
        
        if (this.peso - pesoTotalPerdido < calcularPesoMaximo()*0.15) {
            System.out.println("Seu cachorro vai ficar com peso abaixo de "
                    + "15%, nao pode andar.");
            return;
        }
        
        this.peso = this.peso - pesoTotalPerdido;
        
        float pesoMaximo = calcularPesoMaximo();
        double pesoMagro = pesoMaximo * 0.3;
        double pesoGordo = pesoMaximo * 0.7;

        if (this.peso < pesoMagro) {
            System.out.println("Seu cachorro ficou magricelo!");
        } else if (this.peso >= pesoMagro && this.peso <= pesoGordo) {
            System.out.println("Seu cachorro continua em forma!");
        } else {
            System.out.println("Seu cachorro continua obeso!");
        }
    }

    public void pular(float alturaPulada) {
        alturaPulada  = alturaPulada * 100;
        float alturaMaxima = this.altura * 3;
        
        if (alturaPulada > alturaMaxima) {
            System.out.println("Seu cachorro nao conseguiu pular!");
            return;
        }
        
        if (alturaPulada < alturaMaxima*0.2) {
            System.out.println("Seu cachorro pulou baixo!");
        } else if (alturaPulada >= alturaMaxima*0.2 
                && alturaPulada <= alturaMaxima*0.6) {
            System.out.println("Seu cachorro pulou!");            
        } else {
            System.out.println("Seu cachorro pulou alto!");
        }
        
    }
}
