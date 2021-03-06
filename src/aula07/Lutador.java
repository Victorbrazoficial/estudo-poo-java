package aula07;

// Criando classe, atributos, metdos "getter, setter, construtores e abstratos"
public class Lutador implements InterfaceLutador
{
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float altura;
    private float peso;

    //metodos abstratos
    @Override
    public void apresentar()
    {
        System.out.println("=============Apresentamos o Mosntro==============");
        System.out.println("> Vem ai o Lutador " + this.getNome() + ",");
        System.out.println("> Com nacionaliade " + this.getNacionalidade() + ",");
        System.out.println("> Sua idade exata é de " + this.getIdade() + " anos,");
        System.out.println("> Medindo " + this.getAltura() + "m de altura,");
        System.out.println("> Pesando seus " + this.getPeso() + "Kg,");
        System.out.println("> Com " + this.getVitorias() + " vitorias,");
        System.out.println("" + this.getDerrotas() + " derrotas,");
        System.out.println("e " + this.getEmpates() + " empates!");
    }
   
    @Override
    public void status()
    {
        System.out.println();
        System.out.println("=======Status=======");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() // Soma mais 1 no atributo vitorias
    {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() // Soma mais 1 no atributo derrotas
    {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() // Soma mais 1 no atributo empates
    {
        this.setEmpates(this.getEmpates()+1);
    }

    // Metodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates)
    {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNacionalidade() 
    {
        return nacionalidade;
    }
 
    public void setNacionalidade(String nacionalidade) 
    {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() 
    {
        return categoria;
    }
    
    private void setCategoria() // criando a regra de que so pode haver luta entre lutadores da mesma categoria.
    {
        if (this.getPeso() < 50 ) // "peso abaixo de 50 é invalido"
        {
            this.categoria = "Invalido";
        } 
        else
        if (this.getPeso() <= 70) // "peso menor ou igual a 70 é considerado na categoria leve"
        {
            this.categoria = "Leve";
        }
        else
        if (this.getPeso() <= 80) // "peso menor ou igual a 80 é considerado na categoria medio"
        {
            this.categoria = "Medio";
        }
        else
        if (this.getPeso() <= 120) // "peso menor ou igual a 120 é considerado na categoria pesado"
        {
            this.categoria = "Pesado";
        }
        else    // "acima de 120 é considerado invalido"
        {
            this.categoria = "Invalido";
        }
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public int getVitorias() 
    {
        return vitorias;
    }

    public void setVitorias(int vitorias) 
    {
        this.vitorias = vitorias;
    }

    public int getDerrotas() 
    {
        return derrotas;
    }

    public void setDerrotas(int derrotas) 
    {
        this.derrotas = derrotas;
    }

    public int getEmpates() 
    {
        return empates;
    }

    public void setEmpates(int empates) 
    {
        this.empates = empates;
    }

    public float getAltura() 
    {
        return altura;
    }

    public void setAltura(float altura) 
    {
        this.altura = altura;
    }

    public float getPeso() 
    {
        return peso;
    }

    public void setPeso(float peso) 
    {
        this.peso = peso;
        this.setCategoria();
    }
}