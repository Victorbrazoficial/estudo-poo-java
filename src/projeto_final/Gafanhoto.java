package projeto_final;

public class Gafanhoto extends Pessoa
{
    private String login;
    private int totalAssistido;
    
    public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login) 
    {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotalAssistido(0);
    }

    public void viuMaisUm()
    {
        this.setTotalAssistido(getTotalAssistido() + 1);
    }

    @Override
    protected void ganharExperiencia() 
    {
        this.setExperiencia(this.getExperiencia() + 1f);
    }

    // get e set
    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public int getTotalAssistido() 
    {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) 
    {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() 
    {
        return "Gafanhoto [" + super.toString() + "login=" +  login + ", totalAssistido=" + totalAssistido + "]";
    }   
}