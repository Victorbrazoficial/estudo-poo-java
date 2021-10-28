package aula04;

// Configurando visibilidade de atributos e metodos getter,setter e construct
public class Caneta 
{
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    // Usando metodo "getter" para acessar atributos.
    public void Status()
    {
        System.out.println();    
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("carga: " + this.getCarga() + "%");
        System.out.println("Esta tampada? " + this.getTampada());   
    }

    // Metodo Construct
    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada)
    {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
        this.tampar(); // metodo para tampar a caneta dentro do construtor.
    }
    
    public String getModelo() // "Getter"
    {
        return this.modelo;
    }
    
    public void setModelo(String a)
    {
        this.modelo = a;
    }

    public String getCor() // "Getter"
    {
        return this.cor;
    }

    public void setCor(String a)
    {
        this.cor = a;
    } 

    public float getPonta() // "Getter"
    {
        return this.ponta;
    }

    public void setPonta(float a)
    {
        this.ponta = a;
    }

    public int getCarga() // "Getter"
    {
        return this.carga;
    }

    public void setCarga(int a)
    {
        this.carga = a;
    }

    public boolean getTampada() // "Getter"
    {
        return this.tampada;
    }

    public void setTampada(boolean a)
    {
        this.tampada = a;
    }

    public void tampar() // metedo para tampar caneta
    {
        this.tampada = true;
    }

    public void destampar() // metodo para destampar caneta
    {
        this.tampada = false;
    }
}
