/*
4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
*/

package ex4;

public class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;
    private String cargo;

    Funcionario(String nome, int idade, double salario, String cargo)
    {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

}
