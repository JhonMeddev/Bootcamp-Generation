/*
4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
*/

package ex4;

public class FuncionarioTest {
    
    public static void main(String[] args)
    {
         var func1 = new Funcionario("Chaves bill", 62, 50000, "Vice-Presidente");
         var func2 = new Funcionario("James Bond", 51, 10000, "Lider");
 
         System.out.println("Nome: " + func1.getNome() + ", idade: " + func1.getIdade() + " salario: "
                         + func1.getSalario() + ", cargo: " + func1.getCargo());
         System.out.println();
         System.out.println("Nome: " + func2.getNome() + ", idade: " + func2.getIdade() + " salario: "
                         + func2.getSalario() + ", cargo: " + func2.getCargo());
    }
 }