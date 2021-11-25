package revisao_polimorfismo;

// Sobreescrenvendo "EmitirSom()" para um Lobo
public class Lobo extends Mamifero
{
    @Override
    public void emitirSom() 
    {
        System.out.println("Auuuuuuuu...");   
    } 
}