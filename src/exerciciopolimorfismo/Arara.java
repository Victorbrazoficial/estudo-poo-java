package exerciciopolimorfismo;

// Arara herda de Ave
public class Arara extends Ave
{
    // Metodo construtor
    public Arara(float peso, int idade, int membros, String corPena) 
    {
        super(peso, idade, membros, corPena);
    }
    
    // Metodo personalizado
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========ARARA==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorPena());
        System.out.println();
    }
}