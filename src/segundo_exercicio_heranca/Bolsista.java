package segundo_exercicio_heranca;

// Classe Final não pode ser herdade por outra classe. Obrigatoriamente folha
public final class Bolsista extends Aluno // bolsista herdade Aluno
{
    private int bolsa;

    // Metodo personalizado
    public void renovarBolsa()
    { 
        if (this.getMensalidade() == 250)
        {
            System.out.println("Bolsa Renovada.");
        }
        else
        {
            System.out.println("Antes de renovar a bolsa pague a mensalidade.");
        }
    }    

    @Override
   public void pagarMensalidade(float mensalidade)
   {
        if (mensalidade > 250)
        {
            float troco = mensalidade;

            System.out.println();
            System.out.println("Valor sem bolsa da mensalidade: " + this.getMensalidade());
            System.out.println("Valor inserido: " + mensalidade);
            System.out.println("Bolsa: " + this.getBolsa() + "%");
            
            mensalidade = (this.getMensalidade() * this.getBolsa() / 100);
            
            troco -= mensalidade; 
            System.out.println("Troco: " + troco);   
            System.out.println("valor com bolsa: " + mensalidade);    
            
            this.setMensalidade(mensalidade); // atributo mensalidade passar a ter valor do parametro mensalidade
        }
        else
        if (mensalidade == 250)
        {
            this.setMensalidade(500);
            this.setMensalidade(this.getMensalidade() * this.getBolsa() / 100);
            
            System.out.println();
            System.out.println("Valor da mensalidade: " + this.getMensalidade());
            System.out.println("Valor inserido: " + mensalidade);
            System.out.println("100% da mensalidade foi paga.");
        }
        else
        {
            System.out.println();
            System.out.println(mensalidade + " não é o suficiente para pagar a mensalidade");
            this.setMensalidade(mensalidade);
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
       System.out.println("Bolsa: " + this.getBolsa());
       System.out.println();
   }
    
   // Metodo construtor
    public Bolsista(String nome, int idade, String sexo, int matricula, String curso) 
    {
        super(nome, idade, sexo, matricula, curso); //TODO Auto-generated constructor stub
        this.setMensalidade(500);
        this.setBolsa(50);
    }

    // Metodos get e set
    public int getBolsa() 
    {
        return bolsa;
    }

    public void setBolsa(int bolsa) 
    {
        this.bolsa = bolsa;
    }   
}