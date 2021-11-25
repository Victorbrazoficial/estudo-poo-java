package exercicio_pratico;

// Executando agregação onde pessoa lê Livro
public class Main 
{
    public static void main(String[] args) 
    {
        Pessoa pessoa[] = new Pessoa[2];
        Livro livros[] = new Livro[3];

        pessoa[0] = new Pessoa("Victor", 23, "Masculino");
        pessoa[1] = new Pessoa("Barbara", 22, "Feminino");

        livros[0] = new Livro("As Crônicas de Nárnia", "C. S. Lewis", 752, pessoa[0]);
        livros[1] = new Livro("Os Segredos da Mente Milionária", "T. Harv Eker", 160, pessoa[1]);
        livros[2] = new Livro("Java como programar", "Paul Deitel", 970, pessoa[0]);
       
        System.out.println("=====Detalhes===== \n");
        livros[0].abrir();
        livros[0].detalhes();
        livros[0].folhear(753);
        
        System.out.println("=====Detalhes===== \n");
        livros[1].abrir();
        livros[1].detalhes();
        livros[1].folhear(50);  

        System.out.println("=====Detalhes===== \n");
        livros[2].abrir();
        livros[2].detalhes();
        livros[2].folhear(800);
    }
}