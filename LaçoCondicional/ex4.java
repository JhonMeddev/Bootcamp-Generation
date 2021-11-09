/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
*/

import java.util.*;

public class ex4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int NUM;

        System.out.println("Escreva Algum número: ");
        NUM = input.nextInt();

        if (NUM % 2 == 0) {
            
            System.out.println("O número informado: "+NUM+" é par.");

        } else {
            System.out.println("O número informado: "+NUM+" é impar.");
        }
        if(NUM == 0) {
         
            System.out.println("O número é positivo.");

        }else {
            System.out.println("O número é negativo.");
        }
        
    }
}
