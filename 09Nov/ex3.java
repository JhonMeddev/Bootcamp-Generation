/*
3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

import java.util.*;

public class ex3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade ?\n");
        idade = input.nextInt();

        if(idade <= 14){
            System.out.println("Categoria Infantil!");
        }
        if(idade >= 14 && idade <= 17){
            System.out.println("Categoria Juvenil!");
        }
        if(idade > 18){
            System.out.println("Categoria Adulto !");
        }

    }
    
}
