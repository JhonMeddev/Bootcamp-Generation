package exHeranca;

public class Animal {

	private String nome, caracteristica, som;
	private int idade;
	
	public Animal (String nome, String caracteristica, String som, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		this.caracteristica = caracteristica;
		this.som = som;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
