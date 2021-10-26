package aula02;

// Instanciando objeto e brincando com os metodos da clase Televisão.
public class Ex01 
{
    public static void main(String[] args) throws InterruptedException
    {    
        Televisao tv1 = new Televisao();
        tv1.ligada = false;
        tv1.canal = 0;
        tv1.volume = 0;
        int a = 0;

        tv1.status();

        if (tv1.ligada == false)
        {
            tv1.ligar();
        }

        tv1.status();

        if (tv1.ligada == true)
        {
           System.out.println();
            for (int i = 10; i >= 0; i--)
            {   
                Thread.sleep(1000);
                System.out.println("A Tv ira desligar em " + i);
            }
            tv1.desligarAltomaticamente();
        }
    }    
}