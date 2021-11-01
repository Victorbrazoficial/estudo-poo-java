package aula05;

import java.util.Random;
import java.util.Scanner;

// Exemplo patrico Poo java
public class ContaBanco  
{
    // Atributos
    public int numConta;
    protected String tipo; 
    private String dono;
    private float saldo;
    private boolean status;
    
    // Ultilizando Scanner para dar entrada do usuario
    Scanner entrada = new Scanner(System.in);

    // Menu
    public void menu()
    {
        int opção;          

        System.out.println();
        System.out.println("[BEM-VINDO AO CONTA BANCO]");
        System.out.println("============================");
        System.out.println("1- Abrir conta");
        System.out.println("2- Fechar conta");
        System.out.println("3- Depositar");
        System.out.println("4- Sacar");
        System.out.println("5- Pagar mensalidade");
        System.out.println("6- Extrato bancario");
        System.out.println("7- Sair");
        System.out.println("============================");
        System.out.println();
            
        do
        {
            System.out.println("Escolha uma opção!");
            opção = entrada.nextInt();
        }
        while (opção <= 0 && opção > 7);

        switch (opção)
        {
            case 1: 
                abrirConta();
                break;
            
            case 2: 
                fecharConta();
                break;  
            
            case 3: 
                depositar();
                break;

            case 4:
                sacar();
                break;

            case 5: 
                pagamentoMensal();
                break;

            case 6: 
                extratoBancario();
                break;

            case 7:
                System.out.println("==========================");
                System.out.println("[PROCESSO FINALIZADO]");
                System.out.println("==========================");
                default:
        }
    }

    // Metodo construtor
    public ContaBanco()
    {
        this.setStatus(false);
        this.setSaldo(0);
    }

    // Metodos personalizados
    public void abrirConta()
    {
        System.out.println();
        System.out.println("================");
        System.out.println("[ABRIR CONTA]");
        System.out.println("================");
        System.out.println("[Iniciando processo de abertura de conta]");
        System.out.println("Qual seu nome inicial?");
        this.setDono(entrada.next());
        
        do 
        {   
            System.out.println();
            System.out.println(this.getDono() + " escolha:");
            System.out.println("[cc] Para abrir conta corrente <-> [cp] Para abrir conta poupança");
            this.setTipo(entrada.next());
        } 
        while (!(this.getTipo().equalsIgnoreCase("cc")) && !(this.getTipo().equalsIgnoreCase("cp")));
        
        if (this.getTipo().equalsIgnoreCase("cc"))
        {
            this.setTipo("Conta Corrente");
            this.setSaldo(50);
            System.out.println(this.getTipo() + " Criada com sucesso.");
        }
        if (this.getTipo().equalsIgnoreCase("cp"))
        {
            this.setTipo("Conta Poupança");
            this.setSaldo(150);
            System.out.println(this.getTipo() + " Criada com sucesso.");
        }    
       
        Random aleatorio = new Random();
        this.setNumConta(aleatorio.nextInt(1000000));
        this.setNumConta(Math.abs(this.numConta));
        System.out.println(this.getDono() +" guarde o numero da sua conta: " + this.getNumConta());
        
        this.setStatus(true);
    }
    
    public void fecharConta()
    {
        System.out.println();
        System.out.println("==================");
        System.out.println("[FECHAR CONTA]");
        System.out.println("==================");
        System.out.println("*PARA FECHAR CONTA SEU SALDO PRECISAR ESTAR ZERADO E NÃO PODE ESTAR EM  DEBITO*");

        if (this.getSaldo() == 0)
        {
           this.setStatus(false);
           this.setTipo(null);
           System.out.println(this.getDono() + " Conta fechada com Sucesso. ");
           System.out.println("Status da conta: " + this.getStatus());
        }
        if (this.getSaldo() < 0)
        {
            System.out.println("> Sua conta não pode ser fechada. Motivo: [Conta em Debito] " + "Saldo: " + this.getSaldo());
            System.out.println("> Conta permanece em aberto? " + this.getStatus());
        }
        if (this.getSaldo() > 0)
        {
            this.sacar();
            if (this.getSaldo() == 0)
            {
                this.setStatus(false);
                this.setTipo(null);
                System.out.println("Conta finalizada com sucesso.");
            }
            else
            {
               do 
               {
                   System.out.println("> Sua conta não pode ser fechada. [Motivo]: Conta possui Saldo de: " + this.getSaldo());
                   System.out.println("> Conta permanece em aberto? " + this.getStatus());
                   System.out.println("> Para fechar sua conta faça um saque no valor do saldo.");
                   System.out.println("> [Saldo]: " + this.getSaldo());
                   this.sacar();

                   if (this.getSaldo() == 0)
                   {
                       this.setStatus(false);
                       this.setTipo(null);
                       System.out.println("Conta finalizada com sucesso.");
                   }
                }
                while (this.getSaldo() > 0 && getStatus() == true);
            }
        }
    }

    public void depositar()
    {
        System.out.println();
        System.out.println("=============");
        System.out.println("[DEPOSITAR]");
        System.out.println("=============");

        if (this.getStatus() == true)
        {
           float a;
           System.out.println(this.getDono() + " quanto você deseja depositar?");
           a = entrada.nextFloat();
           this.setSaldo(saldo + a); //
           System.out.println(this.getDono() + " você fez um deposito de " + a);
           System.out.println("Saldo da Conta: " + this.getSaldo());
       }  
       else
       {
           System.out.println(this.getDono() + " impossivel depositar.");
       }
    }

    public void sacar()
    {
        System.out.println();
        System.out.println("=============");
        System.out.println("[SACAR]");
        System.out.println("=============");

        float a;
        
        if (this.getStatus() == true)
        {
            System.out.println(this.getDono() + " seu saldo é de: " + this.getSaldo());
            System.out.println(this.getDono() + " quanto deseja sacar?");
            a = entrada.nextFloat();
            
            if (this.getSaldo() >= a )
            {
                this.setSaldo(saldo - a);
                System.out.println(
                   this.getDono() + " você sacou: " + a);
            }
            else
            {
                System.out.println(this.getDono() + " saldo insuficiente para saque.");
            }
            
            System.out.println("seu saldo é de: " + this.getSaldo());
        }
        else
        {
            System.out.println(this.getDono() + " sua conta esta desativada ou não exite.");
        }
    }
    
    public void pagamentoMensal()
    {
        if (this.getTipo().equalsIgnoreCase("Conta Corrente"))
        {
            this.setSaldo(saldo - 12);
            System.out.println("Debito mensal de R$" + 12.0);
        }
        else
        {
            this.setSaldo(saldo - 20);
            System.out.println("Debito mensal de R$" + 20.0);
        }
        System.out.println(this.getDono() + " seu saldo é de: " + this.getSaldo());

    }

    public void extratoBancario()
    {
        System.out.println();
        System.out.println("================================");
        System.out.println("[EXTRATO BANCARIO]");
        System.out.println("================================");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Conta está aberta? " + this.getStatus());
    }

    // Metodos especiais.
    /**
     * @return int return o numConta
     */
    public int getNumConta()
    {
        return this.numConta;
    }

    /**
     * @param numConta o numConta para set
     */
    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }

    /**
     * @return String return o tipo
     */
    public String getTipo() 
    {     
        return this.tipo;
    }

     /**
     * @param tipo o tipo para set
     */
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    /**
     * @return String return o dono
     */
    public String getDono() 
    {
        return this.dono;
    }

    /**
     * @param dono o dono para set
     */
    public void setDono(String dono) 
    {
        this.dono = dono;
    }

    /**
     * @return float return o saldo
     */
    public float getSaldo() 
    {
        return this.saldo;
    }

    /**
     * @param saldo o saldo para set
     */
    public void setSaldo(float saldo) 
    {
        this.saldo = saldo;
    }

    /**
     * @return boolean return o status
     */
    public boolean getStatus() 
    {
        return this.status;
    }

    /**
     * @param status o status para set
     */
    public void setStatus(boolean status) 
    {
        this.status = status;
    }
}