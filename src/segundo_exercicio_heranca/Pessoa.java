package segundo_exercicio_heranca;

// classe abstrata não pode ser instanciada. Só pode servir como progenitora.
public abstract class Pessoa 
{
    private String nome;
    private int idade;
    private String sexo;

    // Metodo Final: não pode ser subescrito pelas suas sub-classes. Obrigatoriamente herdado
    public final void fazerAniversario()
    {
        this.setIdade(getIdade()+1);
        System.out.println("Feliz Aniversario " + this.getNome());
    }
    
    @Override
    public String toString() 
    {
        return "Dados [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

    // Metodo construtor
    public Pessoa(String nome, int idade, String sexo) 
    {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    // Metodos get e set
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