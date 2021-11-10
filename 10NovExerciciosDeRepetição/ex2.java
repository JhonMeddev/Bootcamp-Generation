/*
2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
*/

import java.util.*;

public class ex2 {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        int par = 0, impar = 0;

        for(int c = 1; c <=10; c++) {

            int ler;
            System.out.println("Digite o numero "+c+" :");
            ler = number.nextInt();

            if(ler%2==0){
                
                par++;

            }
            else{

                impar++;

            }
            System.out.println("Você digitou "+par+ " número par e "+impar+" número ímpar");
            
        }

    }
}
