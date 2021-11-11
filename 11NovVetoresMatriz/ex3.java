/*
3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/

import java.util.*;

public class ex3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n1[][] = new int[4][6], n2[][] = new int[4][6];
        int m1[][] = new int[4][6], m2[][] = new int[4][6];

        for(int l=0; l<4; l++){
            for(int c=0; c<6; c++){

                System.out.println("Digite os valores de N1: ");
                n1[l][c] = input.nextInt();

                System.out.println("Digite os valores de N2: ");
                n2[l][c] = input.nextInt();

                m1[l][c] = n1[l][c] + n2[l][c];
                m2[l][c] = n1[l][c] - n2[l][c];
            }
            System.out.println("\n");
        }
        System.out.println("A matriz de soma M1: "+"\n");
        for(int l=0; l<4; l++){
            for(int c=0; c<6; c++){
                System.out.println(m1[l][c]+" ;");
            }
            System.out.println("\n");
        }
        System.out.println("A matriz das diferenças M2: "+"\n");
        for(int l=0; l<4; l++){
            for(int c=0; c<6; c++){
                System.out.println(m2[l][c]+" ;");
            }
            System.out.println("\n");
        }
    }
    
}
