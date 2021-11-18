/*
 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

 */

package EstudoPoli;

public class LojaDoJhon extends Estoque implements IEstoque {
	
	private String pneus;

	public LojaDoJhon(String aProdutos, String validade, int quantidade, String pneus) {
		
		super(aProdutos, validade, quantidade);
		this.pneus = pneus;
	}

	
	public String getPneus() {
		return pneus;
	}

	public void setPneus(String pneus) {
		this.pneus = pneus;
	}

	@Override
	public void contagem() {
		
		System.out.println(getQuantidade());
		
	}

	@Override
	public void venda() {
		
		System.out.println("Parabéns mais uma venda concluida");
		
	}


	@Override
	public String toString() {
		return "LojaDoJhon pneus = " + pneus;
	}
	
	
}
