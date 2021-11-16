package aula07;

// Instanciando os seis atletas e testando seus metodos para implementar o relacionamento entre Classes.
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
       
       Luta luta01 = new Luta();
       System.out.println();
       luta01.marcarLuta(l[0], l[1]);
       luta01.lutar(l[0], l[1]);
       l[0].status();
       l[1].status();

       Luta luta02 = new Luta();
       System.out.println();
       luta02.marcarLuta(l[2], l[3]);
       luta02.lutar(l[2], l[3]);
       l[2].status();
       l[3].status();

       Luta luta03 = new Luta();
       System.out.println();
       luta03.marcarLuta(l[4], l[5]);
       luta03.lutar(l[4], l[5]);
       l[4].status();
       l[5].status();
    }
}