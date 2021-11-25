package segundo_exercicio_heranca;

// Classe final não poder ser herdade por outra classe. Obrigatoriamente folha
public final class Tecnico extends Aluno // Tecnico herda de Aluno
{
    private int registroProfissional;

    // Metodo personalizado
    public void praticar()
    {
        System.out.println("Praticando....");
    }

    // Metodo Construtor
    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, int registroProfissional) 
    {
        super(nome, idade, sexo, matricula, curso); //TODO Auto-generated constructor stub
        this.setRegistroProfissional(registroProfissional);
    }

    public void detalhes()
    {
        System.out.println();
        System.out.println("====Destalhes====");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Mensalidade: " + this.getMensalidade());
        System.out.println("Registro Profissional: " + this.getRegistroProfissional());
        System.out.println();
    }
    
    // Metodo get e set
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}