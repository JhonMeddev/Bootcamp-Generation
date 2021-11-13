/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex1;

public class ClienteTest {
    
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Jhon",27, 5500.50, "Calmo");
        System.out.println("Informacoes do cliente: ");
        System.out.println("Nome " + cliente1.getName()+ ", idade "+ cliente1.getIdade() 
                            + ", orcamento  "+cliente1.getOrcamento()+ ", temperamento "+ cliente1.getTemp());
        cliente1.pedirAtendimento();
        cliente1.solitarProjeto();
        cliente1.valorPagar();
    }
}

