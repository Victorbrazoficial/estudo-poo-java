package exerciciopolimorfismo;

// Reptil herda de Animal
public class Reptil extends Animal 
{
    private String corDaEscama;
    
    // Metodo construtor
    public Reptil(float peso, int idade, int membros, String corDaEscama) 
    {
        super(peso, idade, membros);
        this.setCorDaEscama(corDaEscama);
    }
    
    //Metodo personalizado
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========REPTÍL==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaEscama());
        System.out.println();
    }

    // Sobreposições
    @Override
    public void locomover()
    {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo Vegetais...");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de réptil...");
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