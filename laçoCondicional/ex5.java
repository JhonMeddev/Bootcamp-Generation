/*
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

import java.util.*;

public class ex5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double ip;

        System.out.println("Leia o indice de poluição: ");
        ip = input.nextDouble();

        if (ip >= 0.05 && ip<=0.25){
            System.out.println("Indice de poluição aceitavel...");
        }
        else if (ip >= 0.25 && ip<=0.3){
            System.out.println("Notifique as empresas do Grupo 1...");
        }
        else if (ip >= 0.3 && ip<=0.4){
            System.out.println("Notifique as empresas do Grupo 1 e 2...");
        }
        else if (ip >= 0.4 && ip<=0.5){
            System.out.println("Notifique todos os Grupos ...");
        }
        else {
            System.out.println("Indice sem classificação !!..");
        }

    }
    
}
