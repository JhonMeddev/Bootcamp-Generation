/*
2- Faça um programa que entre com três números e coloque em ordem crescente.
*/

import java.util.*;

public class ex2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[4];
        
        for (int i=1; i < numeros.length; i++) {

            System.out.println("Digite o numero "+i);
            numeros[i] = (input.nextInt());
        }

        Arrays.sort(numeros);

        System.out.println("Ordem crescente:  ");
        for (int j = 1; j < numeros.length; j++) {
            System.out.println(numeros[j]+" ");
        }

    }
    
}
