package exercicio_heranca;

// Classe filha(sub classe) da Classe Mãe Pessoa(super Classe)
public class Aluno extends Pessoa implements InterfaceAluno
{  
    private boolean matriculado;
    private String curso;
    
    // Metodo personalizado
    public void cancelarMatricula()
    {
        this.setMatriculado(false);
    }
    
    // metodo construtor
    public Aluno(String nome, int idade, String sexo, String curso) 
    {
        super(nome, idade, sexo); //TODO Auto-generated constructor stub   
        this.setCurso(curso);
        this.setMatriculado(true);
    }

    // metodos set e get
    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matricula) {
        this.matriculado = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}