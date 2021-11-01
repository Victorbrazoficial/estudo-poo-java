package aula05;

// Instanciando a Classe ContaBanco e ultilizando seus metodos.
public class Aula05
{
    public static void main(String[] args) 
    {
        ContaBanco contaUm = new ContaBanco();
        contaUm.abrirConta();

        ContaBanco contaDois = new ContaBanco();
        contaDois.abrirConta();

        contaUm.depositar();
        contaDois.depositar();
        contaUm.sacar();
        contaDois.sacar();
        contaUm.fecharConta();

        contaUm.extratoBancario();
        contaDois.extratoBancario();
    }
}