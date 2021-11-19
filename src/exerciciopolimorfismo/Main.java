package exerciciopolimorfismo;

// Criando objetos e executando metodos. (Com os principios de polimorfismo)
public class Main 
{
    public static void main(String[] args) 
    {
        // Objetos
        Mamifero mamiferos = new Mamifero(15, 8, 4, "Preta");
        Reptil reptil = new Reptil(4, 3, 5, "Verde");
        Peixe peixe = new Peixe(0.5f, 1, 0, "Cinza");
        Ave ave = new Ave(2, 11, 2, "Branca");
        Canguru canguru = new Canguru(50f, 12, 5, "Marrom");
        Cachorro cachorro = new Cachorro(6.5f, 3, 5, "Cinza");
        Cobra cobra = new Cobra(7f, 4, 0, "Amarela");
        Tartaruga tartaruga = new Tartaruga(2.5f, 70, 4, "Marrom claro");
        GoldFish goldFish = new GoldFish(0.1f, 1, 0, "Dourado");
        Arara arara = new Arara(7f, 15, 2, "Azul");

        mamiferos.detalhes();
        mamiferos.alimentar();
        mamiferos.locomover();
        mamiferos.emitirSom();

        reptil.detalhes();
        reptil.alimentar();
        reptil.locomover();
        reptil.emitirSom();

        peixe.detalhes();
        peixe.alimentar();
        peixe.locomover();
        peixe.emitirSom();
        peixe.soltarBolha();

        ave.detalhes();
        ave.alimentar();
        ave.locomover();
        ave.emitirSom();
        ave.fazerNinho();

        canguru.detalhes();
        canguru.alimentar();
        canguru.locomover();
        canguru.usarBolsa();

        cachorro.detalhes();
        cachorro.alimentar();
        cachorro.locomover();
        cachorro.enterrarOsso();
        cachorro.abanarRabo();
        
        cobra.detalhes();
        cobra.alimentar();
        cobra.locomover();
        cobra.emitirSom();

        tartaruga.detalhes();
        tartaruga.alimentar();
        tartaruga.locomover();
        tartaruga.emitirSom();

        goldFish.detalhes();
        goldFish.alimentar();
        goldFish.locomover();
        goldFish.emitirSom();
        goldFish.soltarBolha();

        arara.detalhes();
        arara.alimentar();
        arara.locomover();
        arara.emitirSom();
        arara.fazerNinho();
    }
}