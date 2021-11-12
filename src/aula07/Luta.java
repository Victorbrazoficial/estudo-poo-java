package aula07;

import java.util.Random;

// Criando a Classe "Luta" que irá se relacionar com a classe "Lutador" (Agregação)
public class Luta
{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

   
   // Metodos personalizados 
   public void marcarLuta(Lutador desafiado, Lutador desafiante)
   {
       // Se "desafiado e desafiante = mesma categoria" e se "desafiado é diferente de desafiante"
       if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante)
       {
           this.setAprovada(true);
           this.setDesafiado(desafiado);
           this.setDesafiante(desafiante);
           System.out.println("Luta marcada!");
        }
        else // Se "Categoria do desafiado não for igual a do desafiante"
        if ( ! (desafiado.getCategoria().equalsIgnoreCase(desafiante.getCategoria())))
        {
            System.out.println("[Luta não pode ser macada entre lutadores de categorias diferentes.]");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
        else // Se "desafiado e desafiante forem iguais"
        if (desafiado.equals(desafiado) && desafiante.equals(desafiante))
        {
            System.out.println("[Luta não pode ser marcada entre lutadores iguais.]");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

   public void lutar(Lutador desafiado, Lutador desafiante)
   {    
       this.setDesafiado(desafiado);
       this.setDesafiante(desafiante);

       // Se "a luta for aprovada"
       if (this.getAprovada() == true)
        {   
            int a;
            desafiado.apresentar();
            desafiante.apresentar();

            System.out.println();
            System.out.println("Luta iniciada!");
            System.out.println("Luta Finalizada");
            System.out.println();

            // Gerador de numero aleatorio de 0 a 2.
            Random aleatorio = new Random(); 
            a = aleatorio.nextInt(3);
            
            switch (a) // a = numeros aleatorios
            {   
                case 0:
                    System.out.println("O lutador " + desafiado.getNome() + " ganhou a luta.");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                
                case 1:           
                    System.out.println("O lutador " + desafiante.getNome() + " ganhou a luta.");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;

                case 2:
                    System.out.println("Houve empate entre o lutador " + desafiado.getNome() + " e " + desafiante.getNome()); 
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
            }
        }
        else 
        {
            System.out.println("A luta não foi aprovada.");
        }
   }

    // Metodos especiais
    public Luta()
    {
        this.setDesafiado(getDesafiado());
        this.setDesafiante(getDesafiante());
        this.setAprovada(true);
        this.setRounds(0);
    }
 
    public Lutador getDesafiado() 
    {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) 
    {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() 
    {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) 
    {
        this.desafiante = desafiante;
    }

    public int getRounds() 
    {
        return rounds;
    }

    public void setRounds(int rounds) 
    {
        this.rounds = rounds;
    }

    public boolean getAprovada() 
    {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) 
    {
        this.aprovada = aprovada;
    }
}