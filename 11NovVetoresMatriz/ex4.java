/*
4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/

import java.util.*;

public class ex4 {

    public static void main(String[] args) {
        
        double matriz[][] = new double[3][3];
        double valor =0.0, soma=0.0, diagonal=0.0;

        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            for (int c=0; c<3; c++) {
                
                System.out.println("Digite um valor para preencher a matriz: ");
                matriz[i][c] = input.nextDouble();

                soma+= matriz[i][c];
            }
        }
        for(int l=0; l<3; l++){

            diagonal+= matriz[l][l];
        }

        System.out.println("A soma dos valores da matriz é: "+ soma);
        System.out.println("A soma da diagonal principal é: "+ diagonal);

    }
    
}
