/*
4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = (R+S) / 2 , Onde : R = (A + B)2 e S = (B + C)2;
*/

import java.math.*;
import java.util.*;
public class ex4 {

    public static void main(String[] args) {
        
        var teclado = new Scanner(System.in);
        
        int A = 0;
        int B = 0;
        int C = 0;
        double D = 0;
        double R = 0;
        double S = 0;

        System.out.print("Qual valor de A ? : ");
        A = teclado.nextInt();

        System.out.print("Qual valor de B ? : ");
        B = teclado.nextInt();

        System.out.print("Qual valor de C ? : ");
        C = teclado.nextInt();

        R = Math.pow(B, 2);
        S = Math.pow(C, 2);

        D = (R+S)/2;

        System.out.println("O valor de D é : " + D);



    }
    
}
