package exerciciopolimorfismo;

// Ave Herda de Animal
public class Ave extends Animal 
{
    private String corPena;

    // Metodo construtor
    public Ave(float peso, int idade, int membros, String corPena) 
    {
        super(peso, idade, membros);
        this.setCorPena(corPena);
    }

    // Metodo personalizados
    public void detalhes()
    {
        System.out.println();
        System.out.println("==========AVE==========");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
        System.out.println("Cor da Pele: " + this.getCorPena());
        System.out.println();
    }

    public void fazerNinho()
    {
        System.out.println("Fazendo ninho...");
    }

    // Sobreposição
    @Override
    public void locomover()
    {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de ave...");
    }

    // get e set
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}