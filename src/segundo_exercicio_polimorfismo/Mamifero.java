package segundo_exercicio_polimorfismo;

// Polimorfismo sobscrever e sobrecarga
public abstract class Mamifero 
{
    private float peso;
    private int idade;
    
    // metodo abstrato
    public abstract void emitirSom();

    // Contrutor
    public Mamifero(float peso, int idade) 
    {
        this.setPeso(peso);
        this.setIdade(idade);
    }

    // get e set
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }   
}