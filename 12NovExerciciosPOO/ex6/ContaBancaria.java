/*
6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
*/

package ex6;

public class ContaBancaria {
    
    String nome;
    double limite;
    String tipoCartao;
    double saldo;

    ContaBancaria(String nome, double limite, String tipoCartao, double saldo)
    {
        this.tipoCartao = tipoCartao;
        this.nome = nome;
        this.limite = limite;
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTipoCartao() {
        return tipoCartao;
    }

}
