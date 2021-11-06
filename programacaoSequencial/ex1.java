/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */
import java.util.*;
public class sistemaIdade {
	
	public static void main(String[] args) {
		var keyboard = new Scanner(System.in);
		int age = 0;
		int mes = 0;
		int dia = 0;
		int dias = 0;
		
		//escreva()
		System.out.print("Escreva sua idade aqui: ");
		age = keyboard.nextInt();
		System.out.println(age);
		
		System.out.print("Escreva aqui o mês que você nasceu: ");
		mes = keyboard.nextInt();
		System.out.println(mes);
		
		System.out.print("Escreva aqui o dia que você nasceu: ");
		dia = keyboard.nextInt();
		System.out.println(dia);
		
		dias = (age * 365) + (mes * 30) + dia;
		System.out.println("Você nasceu à "+dias+" :)");
				
				
	}

}
