/*
8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.
*/

import java.util.*;

public class ex8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N;

        System.out.println("Digite o número: ");
        N = input.nextInt();

        if(N >= 100){
            System.out.println("Valor: "+N);
        }
        else{
            System.out.println("Valor: 0");
        }
    }
    
}
