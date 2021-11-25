package segundo_exercicio_polimorfismo;

public class Main 
{
    public static void main(String[] args) 
    {
        Cachorro cachorro = new Cachorro(1f, 5);

        cachorro.reagir("Ola"); // frase
        cachorro.reagir("agradavel"); // frase

        cachorro.reagir(true); // Dono
        cachorro.reagir(false); // não é o Dono
        
        cachorro.reagir(5.5f); // horario
        cachorro.reagir(12.5f); // horario
        cachorro.reagir(20f); // horario

         // peso e idade
        cachorro.reagir(); // reagindo ao peso e idade inicial

        // reagindo a diferentis tipos de peso e idade
        cachorro.setIdade(4);   
        cachorro.setPeso(15f);
        cachorro.reagir();

        cachorro.setIdade(11); 
        cachorro.setPeso(2f);
        cachorro.reagir();

        cachorro.setIdade(15); 
        cachorro.setPeso(20.90f);
        cachorro.reagir();
    }
}