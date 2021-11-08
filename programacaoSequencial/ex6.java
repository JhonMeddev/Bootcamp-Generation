/*
6. Construa um programa em que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: D = RAIZ QUADRADA DE (X2-X1)2 + (Y2-Y1)2
*/

import java.util.*;
public class ex6 {
    
    public static void main(String[] args) {
        
        var teclado = new Scanner(System.in);

        double X1, Y1, X2, Y2; 
        double distancia;

        System.out.print("Qual é o valor de X1 ? ");
        X1 = teclado.nextInt();

        System.out.print("Qual é o valor de Y1 ? ");
        Y1 = teclado.nextInt();

        System.out.print("Qual é o valor de X2 ? ");
        X2 = teclado.nextInt();

        System.out.print("Qual é o valor de Y2 ? ");
        Y2 = teclado.nextInt();

        distancia = Math.sqrt(Math.pow((X2-X1), 2)) + Math.pow((Y2-Y1), 2);

        System.out.println("A distancia do ponto 1 e ponto 2 é de: " + distancia);
    }
}
