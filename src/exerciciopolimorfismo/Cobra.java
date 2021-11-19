package exerciciopolimorfismo;

// Cobrea herda de reptil
public class Cobra extends Reptil
{
    // metodo construtor
    public Cobra(float peso, int idade, int membros, String corDaEscama) 
    {
        super(peso, idade, membros, corDaEscama);
    }

    // metodo personalizado
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========COBRA==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaEscama());
        System.out.println();
    }
}