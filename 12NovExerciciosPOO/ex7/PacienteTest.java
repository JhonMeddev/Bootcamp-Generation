/*
7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex7;

public class PacienteTest {
    
    public static void main(String[] args)
    
    {
        var paciente = new Paciente("publico", "Grave", 0, "");
        var paciente2 = new Paciente("Privado", "Leve", 0, "Estavel");

        paciente.setDiasInternado(27);
        paciente.setClassiDeRisco("Risco de Morte");

        paciente2.setDiasInternado(2);

        System.out.println("Tipo de convenio:" + paciente.getConvenio() + ", estado: " + paciente.getCondicao() 
                        + ", dias internado: " + paciente.getDiasInternado() + ", classificao de risco: " + paciente.getClassiDeRisco());
        System.out.println("Tipo de convenio:" + paciente2.getConvenio() + ", estado: " + paciente2.getCondicao() 
                        + ", dias internado: " + paciente2.getDiasInternado() + ", classificao de risco: " + paciente2.getClassiDeRisco());
    }
}
