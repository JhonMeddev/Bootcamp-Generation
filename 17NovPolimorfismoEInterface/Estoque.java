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

public abstract class  Estoque {
	
	private String produtos, validade;
	private int quantidade;
	
	public Estoque(String  aProdutos, String validade, int quantidade) {
		
		super();
		//mesma coisa que o this \/
		produtos = aProdutos;
		this.validade = validade;
		this.quantidade = quantidade;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Estoque produtos = " + produtos + ", validade=" + validade + ", quantidade=" + quantidade + "";
	}
	
	
	
	

}
