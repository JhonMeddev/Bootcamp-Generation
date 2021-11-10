/*
4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o número de pessoas calmas;
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos.
*/

import java.util.*;

public class ex4 {

    public static void main(String[] args) {
        
        int masculino=0, feminino=0, outros=0;
        int pessoasCalmas=0, pessoasAgressivas=0, mulheresNervosas=0, homensAgressivo=0, outrosCalmos=0, pNervosasMaisQuarenta=0, pCalmasMenosDezoito=0;
        int contador = 0;

        Scanner input = new Scanner(System.in);
        while(contador < 150){
            contador++;

            System.out.println("Digite 1 para feminino 2 para masculino e 3 para outros: ");
            int sexo = input.nextInt();
            if(sexo == 1){
                feminino++;
                System.out.println("Qual a sua idade?:");
                int idade = input.nextInt();
                System.out.println("Digite o numero correspondente a sua personalidade 1-Nervosa, 2-Agressiva, 3-Calma");
                int calma = input.nextInt();
                if(calma == 1){
                    mulheresNervosas++;}
                if(calma == 3){
                    pessoasCalmas++;
                }
                if(calma == 1 && idade > 40){
                    pNervosasMaisQuarenta++;
                }
                if(calma == 3 && idade < 18){
                    pCalmasMenosDezoito++;
                }
            }
            if(sexo == 2){
                masculino++;
                System.out.println("Qual a sua idade?:");
                int idade = input.nextInt();
                System.out.println("Digite o numero correspondente a sua personalidade 1-Nervoso, 2-Agressivo, 3-Calmo");
                int calma = input.nextInt();
                if(calma == 2){
                    homensAgressivo++;}
                if(calma == 3){
                    pessoasCalmas++;
                }
                if(calma == 1 && idade > 40){
                    pNervosasMaisQuarenta++;
                }
                if(calma == 3 && idade < 18){
                    pCalmasMenosDezoito++;
                }
            }
            if(sexo == 3){
                outros++;
                System.out.println("Qual a sua idade?:");
                int idade = input.nextInt();
                System.out.println("Digite o numero correspondente a sua personalidade 1-Nervoso(a), 2-Agressivo(a), 3-Calmo(a)");
                int calma = input.nextInt();
                
                if(calma == 3){
                    pessoasCalmas++;
                    outrosCalmos++;
                }
                if(calma == 1 && idade > 40){
                    pNervosasMaisQuarenta++;
                }
                if(calma == 3 && idade < 18){
                    pCalmasMenosDezoito++;
                }
            }

        }
        System.out.println("O numero de pessoas calmas é de: "+pessoasCalmas);
        System.out.println("O numero de mulheres nervosas é de: "+mulheresNervosas);
        System.out.println("O numero de homens agressivos é de: "+homensAgressivo);
        System.out.println("O numero de outros calma é de: "+outrosCalmos);
        System.out.println("O numero de pessoas nervosas com mais de 40 anos é de: "+pNervosasMaisQuarenta);
        System.out.println("O numero de pessoas calmas com menos de 18 anos é de: "+pCalmasMenosDezoito);

    }
    
}
