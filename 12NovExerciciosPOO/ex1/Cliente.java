/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex1;


public class Cliente {
    
        //atributos
        private String nome;
        private int idade;
        private double orcamento;
        private String temperamento;
    
        
        Cliente (String nome,int idade,double orcamento,String temperamento)
        {
            this.nome = nome;
            this.idade = idade;
            this.orcamento = orcamento;
            this.temperamento = temperamento;
    
        }
        public String getName() { return nome;}
        public int getIdade() { return idade;}
        public double getOrcamento() { return orcamento;}
        public String getTemp() { return temperamento;}
        //metodos
        public void pedirAtendimento()
        {
            System.out.println("Gostaria de um atendimento");
        }
        public void solitarProjeto()
        {
            System.out.println("Quero solicar um projeto ");
        }
        public void valorPagar()
        {
            System.out.println("quanto fica? ");
        }
    }
