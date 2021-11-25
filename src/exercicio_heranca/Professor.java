package exercicio_heranca;

// Classe filha(sub classe) da Classe Mãe Pessoa(super Classe)
public class Professor extends Pessoa implements InterfaceProfessor
{
    private String especialidade;
    private double salario;

    // Metodo personalizado
    public void receberAlmento(double almentoSalario)
    {
        this.setSalario(getSalario() + almentoSalario);    
    }
    
    // Metodo construtor
    public Professor(String nome, int idade, String sexo, String especialidade, double salario) 
    {
        super(nome, idade, sexo); //TODO Auto-generated constructor stub
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }
    
    // metodos set e get
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}