package aula02;

import java.util.Scanner;

// Atributos e metodos da classe Televisão.
public class Televisao
{
    boolean ligada;
    int canal;
    int volume;
    Scanner entrada = new Scanner(System.in);
 
    void status()
    {
        System.out.println();
        System.out.println("Tv esta ligada? " + this.ligada);
        System.out.println("canal: " + this.canal);
        System.out.println("volume: " + this.volume);
    }
    
    void ligar()
    {
        System.out.println();
        
        if (this.ligada == true)
        {
            System.out.println("[A Tv já esta ligada.]");
        }
        else
        {   
            System.out.println("A Tv esta desligada, deseja liga-la? [S/N]");
            String ligar = entrada.nextLine();
            if (ligar.equals("s"))
            {
                int a = 0;
                System.out.println();
                System.out.println("[ligando a Tv...]");
                this.ligada = true;
                alteraCanal(a);
                alterarVolume(a);
                status();
            }
        }
    }
    
    void desligar()
    {      
        System.out.println();
        
        if (this.ligada == false)
        {
            System.out.println("[A Tv ja está desligada.]");
        }
        else
        {
            System.out.println("A Tv esta ligada, deseja desliga-la? [S/N]");
            String desligar = entrada.next();
            System.out.println(desligar);
            if (desligar.equals("s"))
            {
                System.out.println();
                System.out.println("[Desligando a Tv...]");
                this.ligada = false;
            }
        }
    }

    void desligarAltomaticamente()
    {
        System.out.println();
        System.out.println("[Desligando a Tv...]");
        this.ligada = false;
    }

    void alteraCanal(int a)
    {
        System.out.println();
        System.out.println("[Qual canal você deseja colocar?]");
        a = entrada.nextInt();
        this.canal = a;
        System.out.println("Canal alterado para " + this.canal);
    }
    
    void alterarVolume(int a)
    {
        System.out.println();
        System.out.println("[Qual volume você deseja colocar?]");
        a = entrada.nextInt();
        this.volume = a;
        System.out.println("Volume da Tv alterado para " + this.volume);
    }   
}