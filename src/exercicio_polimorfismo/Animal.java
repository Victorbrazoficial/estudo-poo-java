package exercicio_polimorfismo;

// Super Classe abstrata, não pode ser instanciada
public abstract class Animal 
{
    protected float peso;
    protected int idade;
    protected int membros;

    // Metodos abstratos
    public abstract void locomover();
    public abstract  void alimentar();
    public abstract  void emitirSom();
    
    // Metodo Construtor
    public Animal(float peso, int idade, int membros) 
    {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    // Metodo get e set
    public float getPeso() 
    {
        return peso;
    }
    public void setPeso(float peso) 
    {
        this.peso = peso;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public int getMembros() 
    {
        return membros;
    }
    public void setMembros(int membros) 
    {
        this.membros = membros;
    }
}