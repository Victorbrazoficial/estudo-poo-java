package aula03;

// Configurando visibilidade de atributos e metodos sem uma regra definida.
public class ExemploAula02 
{
    public static void main(String[] args) 
    {
        Caneta cPreta = new Caneta();
        cPreta.modelo = "Big";
        cPreta.cor = "Preta";        
        cPreta.carga = 50;// atributo protegido pode ser alterado pois a classe caneta está sendo instanciada
        cPreta.tampada = true;       
    //  cPreta.ponta = 0.1f; -> (atributo ponta não pode ser alterado aqui pois ele é privado).
        
        cPreta.status(); 
        cPreta.destampar(); // o metodo destampa e rabisca, pois o metodo é prtegido e no seu bloco ele chama o metodo rabiscar. 
        cPreta.status();
        cPreta.tampar();// o metodo tampa e não rabisca. O erro é impresso nesse caso pois o metodo é protegido e no seu bloco ele chama o metodo rabiscar, que tem uma condicional. 

    //  cPreta.rabiscar(); -> (por enquanto o metodo não pode ser acessado pois ele é privado)
    }
}