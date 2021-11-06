/*
2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
*/
import java.util.*;
public class ex2 {
    
    public static void main(String[] args) {

        var teclado = new Scanner(System.in);
        int anos = 0;
        int meses = 0;
        int dias = 0;

        //escreva
        System.out.print("Digite aqui a quantos dias você nasceu: ");
        dias = teclado.nextInt();

        anos = dias / 365;
       

        meses = (dias % 365) / 30;
        System.out.println("Você tem "+ anos + " anos e "+ meses + " meses .");

        
    }
}
