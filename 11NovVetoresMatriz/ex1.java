/*
1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/

import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double valores[] = new double[5], maior = 0.0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Qual a pontução numero "+(i+1) + ": ");
            valores[i] = input.nextDouble();

            if(valores[i] > maior){
                maior=valores[i];
            }
        }

        System.out.println("A maior pontuação é: "+maior);

    }
    
}
