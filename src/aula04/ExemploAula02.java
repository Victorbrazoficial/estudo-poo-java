package aula04;

// Instanciando obejtos com metodo "Construct", alterando atributos com metodo "Setter".
public class ExemploAula02 
{
    public static void main(String[] args) 
    {
       Caneta cPreta = new Caneta("Bic", "Preta", 0.1f, 100, false); // Instanciando com metodo construtor
       cPreta.Status();
       System.out.println("\n[Alterando atributos com metodo Setter]");
       cPreta.setModelo("Leve");
       cPreta.setCor("Azul");
       cPreta.setPonta(0.5f);
       cPreta.setCarga(50);
       cPreta.destampar(); // Poderia usar metodo setTampada(), porem quis exemplificar com o metodo criado.
       cPreta.Status();
    }
}