package exerciciopolimorfismo;

// Canguru Herda de Mamifero
public class Canguru extends Mamifero
{
    // Metodo construtor
    public Canguru(float peso, int idade, int membros, String corDaPele) 
    {
        super(peso, idade, membros, corDaPele);
    }
    
    // Metodos personalidazos
    public void usarBolsa()
    {
        System.out.println("Usando bolsa...");
    }

    public void detalhes()
    {
        System.out.println();
        System.out.println("==========CANGURU==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorDaPele());
        System.out.println();
    }

    // Sobreposição
    @Override
    public void locomover()
    {
        System.out.println("Pulando...");
    }
}