package aula06;

// Criando classe, atributos, metdos "getter, setter, construtores e abstratos"
public class ControleRemoto implements Controlador
{
    private int volume;
    private int aux;
    private boolean ligado;
    private boolean tocando;
     
    // Metodos especias
    public ControleRemoto()
    {
        this.setVolume(getAux());
        this.setLigado(false);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public boolean getLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean getTocando() {
        return tocando;
    }
    
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Metodos personalizados
    @Override
    public void ligar()
    {
        this.setLigado(true);
    }
    
    @Override
    public void desligar()
    {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu()
    {
        
        System.out.println("=======Menu=======");
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Tocando? " + this.getTocando());
        if (this.getVolume() < 0)
        {
            this.setVolume(0);
            System.out.print("volume: " + this.getVolume() + " <");
        for (int i = 0; i <= this.getVolume(); i += 10)
        {    
            System.out.print("|");
        }
        System.out.println("> \n");
        }
        else
        {
        System.out.print("volume: " + this.getVolume() + " <");
        for (int i = 0; i <= this.getVolume(); i += 10)
        {   
            System.out.print("|");
        }
        System.out.println("> \n");
        }
    }
    
    @Override
    public void fecharMenu()
    {
        System.out.println("[Fechando menu...]");
    }
    
    @Override
    public void maisVolume()
    {
        if (this.getLigado())
        {
            this.setVolume(this.getVolume()+20);
        }
        if (this.getVolume() == 0)
        {
            this.setVolume(getAux());
            this.setVolume(this.getVolume()+5);
        }
    }
    
    @Override
    public void menosVolume()
    {
        if (this.getLigado())
        {
            this.setVolume(this.getVolume()-5);
        }

        if (this.getVolume() == 0)
        {
            this.setVolume(getAux());
            this.setVolume(this.getVolume()-5);
        }
    }
    
    @Override
    public void ligarMudo()
    {
        if (this.getLigado() && this.getVolume() > 0)
        {
            this.setAux(getVolume());
            this.setVolume(this.getVolume()-this.getVolume());
        }
    }
    
    @Override
    public void desligarMudo()
    {
        if (this.getLigado() && this.getVolume() == 0)
        {
            this.setVolume(this.getAux());
        }
    }
    
    @Override
    public void play()
    {
        if (this.getLigado() && this.getTocando() == false)
        {
            this.setTocando(true);
        }
    }
    
    @Override
    public void pause()
    {
        if (this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
    }
}