package exerciciopolimorfismo;

// GoldFish Herda de Peixe
public class GoldFish extends Peixe
{
    // Metodo construtor
    public GoldFish(float peso, int idade, int membros, String corDaEscama) 
    {
        super(peso, idade, membros, corDaEscama);
    }
    
    // Metodo personalizado
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========GOLD FISH==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaEscama());
        System.out.println();
    }
}