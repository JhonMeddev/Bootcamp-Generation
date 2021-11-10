/*
3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =99. (WHILE)
*/

import java.util.*;

public class ex3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int idade = 0, menosDeVinteUm = 0, maisDeCinquenta = 0;

        while(idade < 99) {

            System.out.print("Qual sua idade ?");
            idade = input.nextInt();

            if(idade < 21){
                menosDeVinteUm++;
            }
            if(idade > 50){
                maisDeCinquenta++;
            }

        }
        System.out.println("Existem "+menosDeVinteUm+" pessoas menores de 21 anos e "+maisDeCinquenta+" pessoas com mais de 50 anos !!");
    }
    
}
