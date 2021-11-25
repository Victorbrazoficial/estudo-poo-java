package exercicio_polimorfismo;

// Peixe Herda de Animal
public class Peixe extends Animal
{
    private String corDaEscama;

    // Metodo construtor
    public Peixe(float peso, int idade, int membros, String corDaEscama) 
    {
        super(peso, idade, membros);
        this.setCorDaEscama(corDaEscama);
    }

    // Metodo personalizados
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========PEIXE==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaEscama());
        System.out.println();
    }

    public void soltarBolha()
    {
        System.out.println("Soltando bolha...");
    }

    // Sobreposição
    @Override
    public void locomover()
    {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo substancias...");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de peixe...");
    }

    // get e set
    public String getCorDaEscama() 
    {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) 
    {
        this.corDaEscama = corDaEscama;
    }
}