package segundo_exercicio_heranca;

// Professo herda Pessoa.
public class Professor extends Pessoa
{
    private String especialidade;
    private float salario;

    // Metodos personalidados
    public void receberAlmento(float almentoSalario)
    {
        this.setSalario(getSalario() + almentoSalario);
    }

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) 
    {
        super(nome, idade, sexo); //TODO Auto-generated constructor stub
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public void detalhes()
    {
        System.out.println();
        System.out.println("====Destalhes====");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salario: " + this.getSalario());
        System.out.println();
    }

    // Metodos get e set
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }  
}