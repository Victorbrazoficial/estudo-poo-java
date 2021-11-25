package revisao_polimorfismo;

public class Main 
{
    public static void main(String[] args) 
    {
        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();

        mamifero.emitirSom();
        cachorro.emitirSom();
        lobo.emitirSom();     
    }
}