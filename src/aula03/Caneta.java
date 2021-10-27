package aula03;

// Configurando visibilidade de atributos e metodos sem uma regra definida.
public class Caneta 
{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status()
    {
        System.out.println();    
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga + "%");
        System.out.println("Esta tampada? " + this.tampada);   
    }
    
    private void rabiscar()
    {
        if (this.tampada == true)
        {
            System.out.println("[Erro: caneta tampada.]");
        }
        else
        {
            System.out.println("[escrevendo.......]");
        }
    }

    protected void tampar()
    {
       this.tampada = true;
       this.rabiscar();
    }    

    protected void destampar()
    {
        this.tampada = false;
        this.rabiscar();
    }
}