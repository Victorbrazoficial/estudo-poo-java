package exerciciopolimorfismo;

// Mamifero Herda de Animal
public class Mamifero extends Animal
{
    private String corDaPele;

    // Metodo construtor
    public Mamifero(float peso, int idade, int membros, String corDaPele) 
    {
        super(peso, idade, membros);
        setCorDaPele(corDaPele);;
    }

    // Metodo personalizado
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========MAMIFERO==========");
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
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de mamifero...");
    }

    // metodo get e set
    public String getCorDaPele() 
    {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) 
    {
        this.corDaPele = corDaPele;
    }
}