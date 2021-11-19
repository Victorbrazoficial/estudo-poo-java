package exerciciopolimorfismo;

// Tartaruga Herda de Reptil
public class Tartaruga extends Reptil
{

    // Metodo construtor
    public Tartaruga(float peso, int idade, int membros, String corDaEscama) 
    {
        super(peso, idade, membros, corDaEscama);
    }
    
    // Sobreposição
    @Override
    public void locomover()
    {
        System.out.println("Andando Beem devagar...");
    }

    // Metodo personalizado
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========TARTARUGA==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaEscama());
        System.out.println();
    }
}