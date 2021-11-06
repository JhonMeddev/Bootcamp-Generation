/*
3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/
import java.util.*;
public class ex3 {

    public static void main(String[] args) {
        
        var keyboard = new Scanner(System.in);
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
    
        //Escreva
        System.out.print("Quantos segundos está o evento ? ");
        segundos = keyboard.nextInt();
     
        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60; 
        segundos = (segundos % 3600) % 60;
    
        System.out.println("O evento esta em "+ segundos + " segundos ");
        System.out.println(minutos + " minutos");
        System.out.println("e " + horas + " horas.");
    }

    
}
