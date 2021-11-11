/*
2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ex2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int dado[] = new int[10];
        int valorInicial=1, valorFinal=6, valorSorteado, media=0, cont=0;

        for(int l=0; l<10; l++){

            System.out.println("Digite qualquer numero para rodar o dado : ");
            dado[l]= input.nextInt();

            valorSorteado = (int)(1+Math.random()*6);
            System.out.println("O dado lançado caiu no número: "+ valorSorteado);

            media = valorSorteado + media;
            if (valorSorteado == 6){
                cont = cont +1;
            }
        }
        System.out.println("A média dos valores de seus dados é de: " +(media/2));
        System.out.println("Seu dado caiu no numero 6: " + cont+ "Vezes!!");
    }
}    
