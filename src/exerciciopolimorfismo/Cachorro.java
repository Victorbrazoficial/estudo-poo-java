package exerciciopolimorfismo;

// Cachorro Herda de Mamifero
public class Cachorro extends Mamifero
{
    public Cachorro(float peso, int idade, int membros, String corDaPele) 
    {
        super(peso, idade, membros, corDaPele);
    }
    
    public void enterrarOsso()
    {
        System.out.println("Enterrando Osso...");
    }

    public void abanarRabo()
    {
        System.out.println("Abanando rabo...");
    }

    public void detalhes()
    {
        System.out.println();
        System.out.println("==========CACHORRO==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaPele());
        System.out.println();
    }
}