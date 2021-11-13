/*
7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

package ex7;

public class Paciente {
    
    {
        String convenio;
        String condicao;
        int diasInternado;
        String classiDeRisco;
    
        Paciente(String convenio, String condicao, int diasInternado, String classiDeRisco)
        {
            this.convenio = convenio;
            this.condicao = condicao;
            this.diasInternado = diasInternado;
            this.classiDeRisco = classiDeRisco;
        }
    
        public String getClassiDeRisco() {
            return classiDeRisco;
        }
        public String getCondicao() {
            return condicao;
        }
        public int getDiasInternado() {
            return diasInternado;
        }
        public String getConvenio() {
            return convenio;
        }
    
        public void setClassiDeRisco(String classiDeRisco) {
            this.classiDeRisco = classiDeRisco;
        }
        public void setDiasInternado(int diasInternado) {
            this.diasInternado = diasInternado;
        }
    }
}
