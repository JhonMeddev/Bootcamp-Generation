import java.util.Scanner;

/*
5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
*/

import java.util.*;
public class ex5 {

    public static void main(String[] args) {
        
        var teclado = new Scanner(System.in);
        int P1 = 2; 
        int P2 = 3; 
        int P3 = 5; 
        float N1 = 0, M1 = 0;
        float N2 = 0, M2 = 0; 
        float N3 = 0, M3 = 0, mediaFinal = 0;

        System.out.print("Qual a sua primeira nota ? : ");
        N1 = teclado.nextInt();

        System.out.print("Qual a sua Segunda nota ? : ");
        N2 = teclado.nextInt();

        System.out.print("Qual a sua Terceira nota ? : ");
        N3 = teclado.nextInt();

        M1 = N1 * P1;
        M2 = N2 * P2;
        M3 = N3 * P3;
        mediaFinal = (M1+M2+M3) / 10;

        System.out.println("Sua média final é : " + mediaFinal);


    }
    
}
