/*
7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

import java.util.*;

public class ex7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite o valor da base do triângulo: ");
        base = input.nextInt();

        System.out.println("Digite o valor da altura do triângulo: ");
        altura = input.nextInt();

        area = (base*altura) / 2;

        if(base > 0 && altura > 0) {
            System.out.println("Positivo. A área do triângulo é de: "+area);

        }
        else if(base <= 0 || altura <= 0) {
            System.out.println("O valor indicado é menor do que zero, seja ele de base: "+base+
            " ou altura: "+altura+". Portanto é invalido");
        }
    }
    
}
