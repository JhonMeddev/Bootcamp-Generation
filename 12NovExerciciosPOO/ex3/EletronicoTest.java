/*
3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
*/

package ex3;

public class EletronicoTest {
    
    public static void main(String[] args)
    {
        var laptop = new Eletronico("Dell", 90, "Desligada", "Mecanico", "Desligada", "desconectado");
        var smartPhone = new Eletronico("Motorola", 50, "Desligada", "","Desligada", "");

        System.out.println("laptop: "+ laptop.getModelo() + " nivel de bateria " + laptop.getBateria() 
                            + " tela " + laptop.getTela() + " camera " + laptop.getCamera() + " Mouse " + laptop.getMouse());
        
        System.out.println("Smartphone: "+ smartPhone.getModelo() + " nivel de bateria " + smartPhone.getBateria() 
                            + " tela " + laptop.getTela() + " camera " + laptop.getCamera());

        System.out.println();
        laptop.ligarTela();
        laptop.conectarTeclado();
        laptop.usarMouse();

        System.out.println();
        smartPhone.setBateria(100);

        System.out.println("seu smartPhone esta com " + smartPhone.getBateria() + " de bateria");

    }
}

