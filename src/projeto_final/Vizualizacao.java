package projeto_final;

public class Vizualizacao
{
    private Gafanhoto espectador;
    private Video filme;

    // Construtor
    public Vizualizacao(Gafanhoto espectador, Video filme) 
    {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // metodos de sobrecarga
    public void avaliar(float porcentagem)
    {
        int total = 0;
        
        if (porcentagem <= 20f)
        { 
            total = 3;
        }
        else
        if (porcentagem <= 50f)
        {
            total = 5;
        }
        else
        if (porcentagem <= 90f)
        {
            total = 8;
        }
        else
        if (porcentagem <= 100f)
        {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    public void avaliar(int nota)
    {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }

    // get e set
    public Gafanhoto getEspectador() 
    {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) 
    {
        this.espectador = espectador;
    }

    public Video getFilme() {

        return filme;
    }

    public void setFilme(Video filme) 
    {
        this.filme = filme;
    }


    @Override
    public String toString() 
    {
        return "Vizualização [espectador=" + espectador + ", filme=" + filme + "]";
    }   
}