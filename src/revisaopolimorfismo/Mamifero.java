package revisaopolimorfismo;

// Sobreescrenvendo "EmitirSom()" para um mamifero
public class Mamifero extends Animal
{
    @Override
    public void emitirSom() 
    {
        System.out.println("Som de Mamifero...");  
    }
}