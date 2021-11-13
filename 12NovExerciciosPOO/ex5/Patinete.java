/*
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex5;

public class Patinete {
    
    int veloc;
    String modelo;
    double preco; 
    
    Patinete( int veloc, String modelo, double preco)
    {
        this.modelo = modelo;
        this.preco = preco;
        this.veloc = veloc;
    }

    public String getModelo() {
        return modelo;
    }
    public double getPreco() {
        return preco;
    }
    public int getVeloc() {
        return veloc;
    }

    public void setVeloc(int veloc) {
        this.veloc = veloc;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
