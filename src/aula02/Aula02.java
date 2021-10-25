package aula02;

// Instanciando obejtos e alterando o estado.
public class Aula02 
{
    public static void main(String[] args) 
    {
        Caneta cPreta = new Caneta();
        cPreta.modelo = "Big";
        cPreta.cor = "Preta";
        cPreta.ponta = 0.1f;
        cPreta.carga = 50;
        cPreta.tampada = true;

        Caneta cAzul = new Caneta();
        cAzul.modelo = "Leve";
        cAzul.cor = "Azul";
        cAzul.ponta = 0.5f;        
        cAzul.carga = 100;
        cAzul.tampada = false;
     
        cPreta.status();
        cPreta.rabiscar();
        cPreta.destampar();
        cPreta.status();
        cPreta.rabiscar();

        cAzul.status();
        cAzul.rabiscar();
        cAzul.tampar();
        cAzul.status();
        cAzul.rabiscar();
    }
}