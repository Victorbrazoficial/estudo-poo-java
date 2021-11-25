package segundo_exercicio_polimorfismo;

// Polimorfismo sobscrever e sobrecarga
public class Cachorro extends Mamifero
{
    public Cachorro(float peso, int idade) 
    {
        super(peso, idade);
    }
    
    @Override
    public void emitirSom() 
    {
        System.out.println("Au Au Au!!");  
    }
    
    // reagindo falas
    public void reagir(String agradavel) 
    {
        if (agradavel.equalsIgnoreCase("Ola"))
        {
            System.out.println("Abanando rabo...");
            emitirSom();
        }
        else
        {
            System.out.println("Rosnando...");
        }
    }   

    // reagindo ao horario do dia
    public void reagir(float horario)
    {
        if (horario < 12)
        {
            System.out.println();
            System.out.println("Manha:");
            System.out.println("Abanando rabo...");
        }
        else
        if (horario >= 18)
        {
            System.out.println();
            System.out.println("Anoite:");
            System.out.println("Ignorando...");
        }
        else
        {
            System.out.println();
            System.out.println("Atarde:");
            emitirSom();
            System.out.println("Abanando rabo...");
        }
    }

    // Reagindo ao dono
    public void reagir(boolean dono)
    {
        if (dono)
        {
            System.out.println();
            System.out.println("Dono:");
            System.out.println("Abanando rabo...");
        }
        else
        {
            System.out.println();
            System.out.println("Não é o dono:");
            System.out.println("Rosnando...");
            emitirSom();
        }
    }

    // reagindo diante da idade e peso
    public void reagir()
    {
        System.out.println();

        if (( this.getIdade() < 10 ) && ( this.getPeso() < 5f )) // novo e leve
        {
            System.out.println("Novo e leve:");
            System.out.println("Abanando...");
        }
        else
        if (( this.getIdade() < 10) && ( this.getPeso() >= 10f)) // novo e pesado
        {
            System.out.println("Novo e pesado:");
            emitirSom();
        }
        else
        if (( this.getIdade() >= 11 ) && ( this.getPeso() < 5f )) // velho e leve
        {
            System.out.println("Velho e leve");
            System.out.println("Rosnando...");
        }
        else
        if (( this.getIdade() >= 11 ) && ( this.getPeso() >= 10f )) // velho e pesado
        {
            System.out.println("Velho e Pesado");
            System.out.println("Ignorando...");
        }
    }
}