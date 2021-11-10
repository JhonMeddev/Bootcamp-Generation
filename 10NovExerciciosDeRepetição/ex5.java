/*
5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/

import java.util.*;

public class ex5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number, total =0 ; 
        do{
            System.out.println("Digite um numero: ");
            number = input.nextInt();
            total = number + total;

        }
        while(number != 0);
        
        System.out.println("A soma dos numeros digitados é: "+total);

    }


    
}
