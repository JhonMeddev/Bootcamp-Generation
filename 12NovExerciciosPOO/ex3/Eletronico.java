/*
3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
*/

package ex3;

public class Eletronico {
    
    private String modelo;
    private int bateria;
    private String camera;
    private String teclado;
    private String tela;
    private String mouse;

    // construtor
    Eletronico(String aModelo, int aBateria, String aCamera, String aTeclado, String aTela, String aMouse )
    {
        modelo = aModelo;
        bateria = aBateria;
        camera = aCamera;
        teclado = aTeclado;
        tela = aTela;
        mouse = aMouse;
    }

    //getters retornarem os valores que estao privados
    public int getBateria() {
        return bateria;
    }
    public String getCamera() {
        return camera;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMouse() {
        return mouse;
    }
    public String getTeclado() {
        return teclado;
    }
    public String getTela() {
        return tela;
    }
    
    //metodos
    public void ligarTela()
    {
        System.out.println("sua tela esta ligada");
    }
    public void conectarTeclado()
    {
        System.out.println("Teclado funcionando");
    }
    public void usarMouse()
    {
        System.out.println("Mouse esta pronto para uso");
    }

    //setter -- mudar o valor de uma variavel privada
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}

