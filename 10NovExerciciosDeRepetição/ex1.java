/*
1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
*/


public class ex1 {

    public static void main(String[] args) {
        
        for(int number=1000; number <=1999; number++ ){
            int resto = number % 11;

            if(resto == 5){
                System.out.println(number);
            }
        }
    }
    
}
