package exercicio_heranca;

// Classe filha(sub classe) da Classe Mãe Pessoa(super Classe)
public class Funcionario extends Pessoa implements InterfaceFuncionario
{
    private String setor;
    private boolean trabalhando;
    
    // Metedo personalizado
    public void mudarTrabalho(String alterarSetor)
    {
        if (getTrabalhando())
        {
            this.setSetor(alterarSetor);
            System.out.println("Trabalho alterado para o setr: " + alterarSetor);
        }
        else
        {
            System.out.println("Não tem como alterar setor, pois o funcionario " + this.getNome() + " não esta trabalhando.");
        }
    }
    
    // Metodo construtor
    public Funcionario(String nome, int idade, String sexo, String setor) 
    {
        super(nome, idade, sexo); //TODO Auto-generated constructor stub
        this.setSetor(setor);
        this.setTrabalhando(true);
    }
    
    // metodo get e set
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}