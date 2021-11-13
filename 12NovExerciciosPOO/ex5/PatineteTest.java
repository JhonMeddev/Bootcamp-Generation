/*
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
package ex5;

import java.util.*;

public class PatineteTest {
    public static void main(String[] args)
    
    {
        var scooter =  new Patinete(0, "Eletrico", 4000);
        var kb = new Scanner(System.in);
        int preco, veloc;

        System.out.print("Preco patinete: ");
        preco = kb.nextInt();
        
        scooter.setPreco(preco);
        System.out.print("Velocidade patinete: ");
        veloc = kb.nextInt();
        scooter.setVeloc(veloc);

        System.out.println("Velocidade: " + scooter.getVeloc() + " modelo " + scooter.getModelo() 
        + " preco: " + scooter.getPreco());

    }
}
