/*
7. Um sistema de equações lineares do tipo: ax + by = c ; dx = ey = f ; pode ser resolvido segundo mostrado abaixo :
x = ce - bf / ae - bd ; y = af - cd / ae - bd ; 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
*/

import java.util.*;
public class ex7 {

    public static void main(String[] args) {
        
        var teclado = new Scanner(System.in);
        double A, B, C, D, E, F;
        double X, Y;

        System.out.print("Qual o valor de A ? : ");
        A = teclado.nextInt();

        System.out.print("Qual o valor de B ? : ");
        B = teclado.nextInt();

        System.out.print("Qual o valor de C ? : ");
        C = teclado.nextInt();

        System.out.print("Qual o valor de D ? : ");
        D = teclado.nextInt();

        System.out.print("Qual o valor de E ? : ");
        E = teclado.nextInt();

        System.out.print("Qual o valor de F ? : ");
        F = teclado.nextInt();

        X = ((C*E) - (B*F)) / ((A*E)-(B*D));
        Y = ((A*F) - (C*D)) / ((A*E)-(B*D));

        System.out.println("O valor de X é: "+X+" e o valor de Y é: "+Y);
    }
    
}
