import com.loja02.itens.Produto;

public class Carrinho {
	private Produto produtoAdicionado; 
	
	public Carrinho(Produto temp) {
		this.produtoAdicionado = temp;		
	}

	@Override
	public String toString() {
		return "["+ produtoAdicionado + "]";
	}


}
