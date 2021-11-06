/*
8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/

import java.util.*;
public class ex8 {

    public static void main(String[] args) {
        
        var teclado = new Scanner(System.in);

        double custoConsumidor, custoFabrica, ganhoDistribuidor, ganhoGoverno;  
        double percentagemDistribuidor = 28, impostos = 45;

        System.out.print("Qual é o custo de fabrica deste carro ? ");
        custoFabrica = teclado.nextInt();

        ganhoDistribuidor = (custoFabrica*percentagemDistribuidor) / 100;
        ganhoGoverno = (custoFabrica*impostos) / 100;

        custoConsumidor = custoFabrica + ganhoGoverno + ganhoDistribuidor;

        System.out.println("O preço para o consumidor final deste veiculo é de : "+custoConsumidor+ "R$");
    }
    
}
