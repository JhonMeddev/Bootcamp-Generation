package exHeranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Hulk","Corre","Au",5);
		Animal cavalo = new Cavalo("Eskeiro","Corre","irri",7);
		Animal preguica = new Preguica("Geremias","Sobe arvore","kk",174);
		
		System.out.println(cachorro.getNome());
		System.out.println(cavalo.getNome());
		System.out.println(preguica.getIdade());
		
	}

}
