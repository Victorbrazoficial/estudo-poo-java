package revisao_polimorfismo;

// Sobreescrenvendo "EmitirSom()" para um cachorro
public class Cachorro extends Lobo
{
    @Override
    public void emitirSom()
    {
        System.out.println("Auu auu auu...");
    }
}