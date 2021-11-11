/*
6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/

import java.util.*;

public class ex6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        int c=0, somaNumeros=0, mediaNumeros, multiplosDeTres=0;
        
        System.out.println("Digite quantos numeros quiser para fazer a média dos multiplos de 3 ou 0 para encerrar o programa: ");
        
        do{ 

            c++;
            System.out.println("Digite o numero "+c);
            number = input.nextInt();
            if(number%3==0){
            
                somaNumeros = number + somaNumeros;
                multiplosDeTres++;
            
            }
        }while(number != 0);

        mediaNumeros = somaNumeros / multiplosDeTres;
        System.out.println("A média dos números múltiplos de 3 é: "+mediaNumeros);
    }
    
}
