package projeto_final;

public class Youtube 
{
    public static void main(String[] args) 
    {
        Video video[] = new Video[3];

        video[0] = new Video("Curso em video.");
        video[1] = new Video("Alteico x Cruzeiro.");
        video[2] = new Video("Aula de Portugues.");
        
        video[0].play();
        video[0].like();

        video[1].like();
        video[1].pause();

        Gafanhoto gafanhoto[] = new Gafanhoto[3];
        gafanhoto[0] = new Gafanhoto("Victor", 12, "M", 1.7f, "123");
        gafanhoto[0].ganharExperiencia();

        Vizualizacao vizualizacao[] = new Vizualizacao[3];

        vizualizacao[0] = new Vizualizacao(gafanhoto[0], video[0]);
        vizualizacao[0].avaliar();
        System.out.println(vizualizacao[0].toString());
        
        System.out.println();

        vizualizacao[1] = new Vizualizacao(gafanhoto[0], video[1]);
        vizualizacao[1].avaliar(89f);
        System.out.println(vizualizacao[1].toString());

        System.out.println();

        vizualizacao[2] = new Vizualizacao(gafanhoto[0], video[2]);
        vizualizacao[2].avaliar(1);
        System.out.println(vizualizacao[2].toString());   
    }    
}