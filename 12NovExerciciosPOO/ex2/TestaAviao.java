/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex2;

import java.util.*;

public class TestaAviao{

    public static void main(String[] args)
    {
        var aviao = new Aviao(300, 100, "747", "airbus");

        Scanner input = new Scanner(System.in);
        int assentos, nivelCombust;
        
        System.out.println("Piloto, quantos assentos estão ocupados?");
        assentos = input.nextInt();
        aviao.setBancos(assentos);

        System.out.println("Qual o nivel de combustivel ?");
        nivelCombust = input.nextInt();
        aviao.setCombustivel(nivelCombust);


        System.out.println("Aviao numero 1 informacoes: ");
        System.out.println("numero de bancos ocupados: " + aviao.getBancos() + ", Nivel de combustivel: " + aviao.getcombustivel() + "%"
                            + ", modelo "+ aviao.getModelo() + ", fabricante " + aviao.getFabri());

        aviao.autorirDecolagem();
        aviao.decolar();  
        aviao.pousar();
    }
}
