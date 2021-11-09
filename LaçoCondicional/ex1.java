/*
1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
*/

import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int PT, E, M = 4;
        double PM;

        System.out.print("Qual o peso dos tomates em KG?: ");
        PT = input.nextInt();

        PM = (PT - 50) * M;
        E = PT - 50;
        
        if (PT <= 50) {
            System.out.print("Não existem tributos a serem pagos");
        }
        else {
            System.out.println("O valor da multa é: "+PM+"R$");
            System.out.println("O valor do excesso é: "+E+"KG");
        }
    }
    
}
