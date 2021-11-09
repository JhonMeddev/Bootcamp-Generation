/*
6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

import java.util.*;

public class ex6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Quantos anos você tem ? ");
        idade = input.nextInt();

        if (idade <= 5 && idade <=7){
            System.out.println("Categoria: Infantil A ");
        }
        else if (idade >= 8 && idade <=11){
            System.out.println("Categoria: Infantil B ");
        }
        else if (idade >= 11 && idade <=13){
            System.out.println("Categoria: Juvenil A ");
        }
        else if (idade >= 13 && idade <=17){
            System.out.println("Categoria: Juvenil B ");
        }
        else if (idade >= 18){
            System.out.println("Categoria: Adulto");
        }
    }
    
}
