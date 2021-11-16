package exerciciopratico;

// Criando Classe Pessoa
public class Pessoa 
{
    private String nome;
    private int idade;
    private String sexo;

    // personalizados
    public void fazerAniversario()
    {
        this.setIdade(getIdade() + 1);
        System.out.println("Comerando aniversario.");
    }

    // Construtor
    public Pessoa(String nome, int idade, String sexo)
    {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    // get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}