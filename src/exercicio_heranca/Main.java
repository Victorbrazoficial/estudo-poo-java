package exercicio_heranca;

// Executando subClasses que herdam alguns atributos de suas superClasses e alterando alguns dados atraves de setter's
public class Main 
{
    public static void main(String[] args) 
    {
        Aluno aluno = new Aluno("Victor", 23, "Masculino", "Ads");
        Funcionario funcionario = new Funcionario("João", 44, "Masculino", "Financeiro");
        Professor professor = new Professor("Gustavo Guanabara", 39, "Masculino", "Pragamção Orientada a Obejetos", 5255.25);

        aluno.setMatriculado(true);
        aluno.setCurso("Adm");
        funcionario.setNome("Marco Aurelio");
        funcionario.mudarTrabalho("Carpinteiro");
        professor.setIdade(2000);
        professor.setSalario(653.20);
        professor.receberAlmento(1000);
        funcionario.mudarTrabalho("Carpinteiro");

        System.out.println("======Detelhas======"); 
        System.out.println();
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Sexo: " + aluno.getSexo());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Matriculado: " + aluno.getMatriculado());
        System.out.println();

        System.out.println("======Detelhas======"); 
        System.out.println();
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Trabalhando: " + funcionario.getTrabalhando());
        System.out.println();

        System.out.println("======Detelhas======"); 
        System.out.println();
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Sexo: " + professor.getSexo());
        System.out.println("Especialidade: " + professor.getEspecialidade());
        System.out.println("Salario: " + professor.getSalario());
        System.out.println();
    }
}
