/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex2;

public class Aviao {
    
    private int bancos;
    private int combustivel;
    private String modelo;
    private String fabricante;
    

    Aviao(int bancos, int combustivel, String modelo, String afabricante)
    {
        this.bancos = bancos;
        this.combustivel = combustivel;
        this.modelo = modelo;
        fabricante = afabricante;
    }

    public int getBancos() { return bancos; }
    public int getcombustivel() { return combustivel; }
    public String getModelo() { return modelo; }
    public String getFabri() { return fabricante; }

    public void setBancos(int bancos) {
        this.bancos = bancos;
    }

    //metodos

    public void autorirDecolagem()
    {
        if(combustivel == 100){
            System.out.println("Garantida!");
        }else{
            System.out.println("Combustivel Insuficiente");
        }
       
    }
    
    public void decolar()
    {
        if(combustivel == 100){
            System.out.println("Decolagem feita");
        }else{
            System.out.println("Decolagem Negada");
        }
        
    }
    
    public void pousar()
    {
        if(combustivel == 100){
            System.out.println("Pouso feito com sucesso");
        }else{
            System.out.println("Avião Não decolou");
        }

    }
}
