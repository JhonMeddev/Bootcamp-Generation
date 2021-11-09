/*
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
import java.util.*;

public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double N1, N2, N3, N4;
        double C1, C2, C3, C4;

        System.out.println("Qual o valor do Numero 1 ?");
        N1 = input.nextInt();

        System.out.println("Qual o valor do Numero 2 ?");
        N2 = input.nextInt();

        System.out.println("Qual o valor do Numero 3 ?");
        N3 = input.nextInt();

        System.out.println("Qual o valor do Numero 4 ?");
        N4 = input.nextInt();

        C1 = Math.pow(N1, 2);
        C2 = Math.pow(N2, 2);
        C3 = Math.pow(N3, 2);
        C4 = Math.pow(N4, 2);

        if (C3 >= 1000) {
            System.out.println("O quadrado do numero 3 é : "+C3);
        }
            else{
                System.out.println("O quadrado do numero 1 é : "+C1+" O quadrado do numero 2 é : "+C2+" O quadrado do numero 3 é : "+C3+" O quadrado do numero 4 é : "+C4);

            }

    }
}
