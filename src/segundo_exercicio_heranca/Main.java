package segundo_exercicio_heranca;

public class Main 
{
    public static void main(String[] args) 
    {
        Aluno aluno = new Aluno("Victor", 23, "Masculino", 50505050, "Ads");
        System.out.println("==========ALUNO==========");
        aluno.detalhes();
        aluno.fazerAniversario(); // + 1 ano
        // testando o metodo pagar mensalidade no valor de 500
        aluno.pagarMensalidade(800.0f); // vai dar trouco de 300
        aluno.pagarMensalidade(400.0f); // não vai aceitar pois valor é menor q 500
        aluno.pagarMensalidade(500); // vai aceitar 
        aluno.detalhes();

        Bolsista alunBolsista = new Bolsista("Pedro", 40, "masculino", 89898989, "G. Financeiro");
        System.out.println("==========ALUNO BOLSISTA==========");
        alunBolsista.detalhes();
        alunBolsista.fazerAniversario(); // + 1 ano
        // testando o metodo pagar mensalidade no valor de 500
        alunBolsista.pagarMensalidade(800.0f); // vai dar trouco de 300
        alunBolsista.renovarBolsa();
        alunBolsista.pagarMensalidade(150.0f); // não vai aceitar pois valor é menor q 250
        alunBolsista.renovarBolsa();
        alunBolsista.pagarMensalidade(250); // vai aceitar 
        alunBolsista.renovarBolsa();
        alunBolsista.detalhes();

        System.out.println("==========VISITANTE==========");
        Visitante visitante = new Visitante("Otavio", 12, "Masculino");
        System.out.println(visitante.toString());
        System.out.println();
        visitante.setNome("Braz");
        visitante.setIdade(20);
        System.out.println(visitante.toString());
        
        Professor professor = new Professor("Gustavo", 50, "Masculino", "Adm", 5000);
        System.out.println("==========PROFESSOR==========");
        professor.detalhes();
        professor.setNome("Bia");
        professor.setSexo("Feminino");
        professor.setIdade(20);
        professor.receberAlmento(500);
        professor.detalhes();

        Tecnico tecnico = new Tecnico("Gui", 80, "Masculino", 5858585, "Biologia", 8888);
        System.out.println("==========TECNICO==========");
        tecnico.detalhes();
        tecnico.fazerAniversario(); // + 1 ano
        // testando o metodo pagar mensalidade no valor de 500
        tecnico.pagarMensalidade(1000.0f); // vai dar trouco de 500
        tecnico.pagarMensalidade(300.0f); // não vai aceitar pois valor é menor q 500
        tecnico.pagarMensalidade(500); // vai aceitar 
        tecnico.setRegistroProfissional(1111111);
        tecnico.detalhes();   
    }
}