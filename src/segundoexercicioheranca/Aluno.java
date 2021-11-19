package segundoexercicioheranca;

// Aluno Herda de Pessoa.
public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;
    private float mensalidade;

    // Metodo personalizado
    public void pagarMensalidade(float mensalidade)
    {       
        System.out.println();
    
        if (mensalidade == this.getMensalidade())
        {
            System.out.println("Valor da mensalidade: " + this.getMensalidade());
            System.out.println("Valor inserido: " + mensalidade);
            System.out.println("100% da mensalidade foi paga.");
        }
        else
        if (mensalidade > this.getMensalidade())
        {
            System.out.println("Valor da mensalidade: " + this.getMensalidade());
            System.out.println("Valor inserido: " + mensalidade);
            mensalidade -= this.getMensalidade();
            System.out.println("Mensalidade efetuada, seu troco é de: " + mensalidade);
        }
        else
        if (mensalidade < this.getMensalidade())
        {
            System.out.println("Valor da mensalidade: " + this.getMensalidade());
            System.out.println("Valor inserido: " + mensalidade);
            System.out.println("O valor inserido de " + mensalidade + " não cobre o valor da mensalidade.");
        }
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
        System.out.println();
    }

    // Metodo Construtor
    public Aluno(String nome, int idade, String sexo, int matricula, String curso)
    {
        super(nome,idade,sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);
        this.setMensalidade(500);
    }

    // Metodos set e get
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(final int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(final String curso) {
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(final float mensalidade) {
        this.mensalidade = mensalidade;
    }
}