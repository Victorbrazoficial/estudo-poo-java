package aula07;

// Instanciando os 6 atletas e testando seus metodos para implementar o relacionamento entre Classes.
public class Aula07 
{
   public static void main(String[] args) 
   {  
       Lutador l[] = new Lutador[6];
       l[0] = new Lutador("Petty Boy", "Francesa", 31, 1.75f, 68.9f, 11, 2, 1);
       l[1] = new Lutador("Putscript", "Brasileira", 29, 1.68f, 57.8f, 14, 2, 3);
       l[2] = new Lutador("Snapshadow", "Americana", 35, 1.65f, 80.9f, 12, 2, 1);
       l[3] = new Lutador("Dead Code", "Australiana", 28, 1.93f, 81.6f, 13, 0, 2);
       l[4] = new Lutador("Ufocobol", "Brasileira", 37, 1.70f, 119.3f, 5, 4, 3);
       l[5] = new Lutador("Nerdaard", "Americana", 30, 1.81f, 105.7f, 12, 2, 4);
       
       for (int i = 0; i < l.length; i++)
       {
           l[i].apresentar(); 
           l[i].status();
        }
    }
}