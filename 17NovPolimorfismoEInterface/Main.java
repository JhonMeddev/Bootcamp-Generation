package EstudoPoli;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int tipo;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos tipos de pneu você tem ? ");
		tipo = input.nextInt();
		
		ArrayList <LojaDoJhon> Loja1 = new ArrayList(); 
		
		
		for(int i = 0; i < tipo; i++) {
			
			String produtos, validade, pneus;
			int quantidade; 
			System.out.println("Quantos produtos temos?");
			produtos = input.next();
			
			System.out.println("Qual a validade ?");
			validade = input.next();
			
			System.out.println("quantos pneus ?");
			pneus = input.next();
			
			System.out.println("qual quantidade ?");
			quantidade = input.nextInt();
			
			Loja1.add(new LojaDoJhon(produtos, validade, quantidade, pneus));
				 
		}
		
		for (LojaDoJhon al : Loja1) {
			System.out.println(al);
		}
		
	
		
		
	}

}
