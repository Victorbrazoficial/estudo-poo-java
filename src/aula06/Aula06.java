package aula06;

//  Instanciando a Classe ControleRemoto e ultilizando seus metodos especiais e metods abstratos.
public class Aula06 
{
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.abrirMenu();

        c1.ligar();
        c1.play();
        c1.maisVolume();
        c1.maisVolume();
        c1.abrirMenu();
        c1.fecharMenu();

        c1.menosVolume();
        c1.menosVolume();
        c1.menosVolume();
        c1.pause();
        c1.abrirMenu();

        c1.ligarMudo();
        c1.abrirMenu();

        c1.desligarMudo();
        c1.desligar();
        c1.abrirMenu();
        c1.fecharMenu();
    }
}