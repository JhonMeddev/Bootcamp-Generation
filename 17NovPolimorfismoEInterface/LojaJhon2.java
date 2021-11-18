package EstudoPoli;

public class LojaJhon2 extends Estoque implements IEstoque {
	
	private String moto;

	public LojaJhon2(String aProdutos, String validade, int quantidade, String moto) {
		
		super(aProdutos, validade, quantidade);
		this.moto = moto;
	}

	public String getMoto() {
		return moto;
	}

	public void setMoto(String moto) {
		this.moto = moto;
	}

	@Override
	public void contagem() {
		System.out.println("Ainda restam : "+getQuantidade()+" motos");
		
	}

	@Override
	public void venda() {
		System.out.println("Parabéns, mais uma moto vendida !");
		
	}

	@Override
	public String toString() {
		return "LojaJhon2 moto = " + moto;
		
	}
	
	

}
