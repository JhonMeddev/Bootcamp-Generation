/*
2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/
import java.util.*;

public class ex2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int Cod, Horas, HorasExtra, Sal;
        double SalTotal, SalExtra;

        System.out.println("Olá colaborado, qual é o teu código ? ");
        Cod = input.nextInt();

        System.out.println("Quantas horas você trabalhou? ");
        Horas = input.nextInt();

        HorasExtra = Horas - 50;
        Sal = (Horas - HorasExtra) * 10;
        SalExtra = HorasExtra * 20;
        SalTotal = Sal + SalExtra;

        System.out.println("O salario total é de: "+SalTotal+"R$");
        if (SalExtra > 0){
            System.out.println("Parabéns, você recebeu: "+SalExtra+"R$ de horas extras ");

        }
        else {
            System.out.println("Nenhuma hora extra !");
        }
    }
    
}
