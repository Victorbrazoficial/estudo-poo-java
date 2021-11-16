package exerciciopratico;

// Classe Livro que vai ter relacionamento de agregação com Clase Pessoa
public class Livro  implements InterfaceLivro
{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Personalizados
    public void detalhes()
    {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("total de paginas: " + this.getTotPaginas());
        System.out.println("Pagina autual: " + this.getPagAtual());
        System.out.println("Livro esta aberto? " + this.getAberto());
        System.out.println("leitor: " + leitor.getNome());
        System.out.println("Idade do leitor: " + leitor.getIdade() + " anos");
        System.out.println("Sexo do leitor: " + leitor.getSexo());
    }

    // Abstratos
    @Override
    public void abrir()
    {
        this.setAberto(true);
    }

    @Override
    public void fechar()
    {
        this.setAberto(false);
    }

    @Override
    public void folhear(int paginas)
    {
        if (paginas > this.getTotPaginas())
        {
            System.out.println("Folhear até a pag " + paginas);
            this.setPagAtual(0);
            System.out.println(">Não existe essa pagina para folhear.");
        }
        else
        {
            this.setPagAtual(paginas);
            System.out.println(">Folheando até a Pagina: " + paginas);
        }
    }

    @Override
    public void avancarPag()
    {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag()
    {
        this.setPagAtual(getPagAtual() - 1);
    }

    // Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor)
    { 
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    // get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}