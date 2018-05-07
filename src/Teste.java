import java.util.Scanner;
/**
 * 
 * @author Emilio de Oliveira
 *
 */

public class Teste {
	static Produto produto[] = new Produto[10];
	static Carrinho vCarrinho[] = new Carrinho[10];
	public static void main(String[] args) {	

		while (true) {
			switch (readString(menu()).charAt(0)) {
			case '1':
				cadastraProduto();
				break;
			case '2':
				listarProduto();
				break;
			case '3':
				insereCarrinho();
				break;
			case '4':
				listarCarrinho();
				break;
			case '5':
				System.exit(0);
				break;
			}
		}		
	}

	private static void listarProduto() {
		if (produto[0] != null) {			
			for (int a = 0; a < produto.length; a++) {
				if (produto[a] != null) {
					System.out.println(a+". "+produto[a]);
				}
			}			
		}	else {
			System.out.println("A lista de produtos está vazia!");
		}
	}

	private static void listarCarrinho() {
		if (vCarrinho[0] != null) {			
			for (int a = 0; a < vCarrinho.length; a++) {
				if (vCarrinho[a] != null) {
					System.out.println(a+". "+vCarrinho[a]);
				}
			}			
		}	else {
			System.out.println("O carrinho de compras está vazio!");
		}
	}

	private static void cadastraProduto() {
		// String nome = readString("Digite o nome do produto: ");
		// double preco = Double.parseDouble(readString("Digite o preço do produto: "));
		// String sku = readString("Digite o SKU do produto: ");
		for (int b = 0; b < produto.length; b++) {
			if (produto[b] == null) {
				produto[b] = new Produto();
				//produto[b] = new Produto(nome, preco, sku);
				return;
			}
		}
	}

	private static String readString(String msg) {
		Scanner a = new Scanner(System.in);
		System.out.println(msg);
		return a.nextLine();

	}

	private static void insereCarrinho() {
		listarProduto();
		int ind = Integer.parseInt(readString("Digite o número da opção : "));
		Produto temp = produto[ind];
		for (int b = 0; b < vCarrinho.length; b++) {
			if (vCarrinho[b] == null) {
				vCarrinho[b] = new Carrinho(temp);
				return;
			}
		}
	}

	private static String menu() {
		String menu = "";
		menu += "\nLoja de produtos:";
		menu += "\n  1 - Cadastrar produtos.";
		menu += "\n  2 - Listar produtos.";
		menu += "\n  3 - Comprar produtos.";
		menu += "\n  4 - Mostrar carrinho.";
		menu += "\n  5 - Sair.";
		menu += "\nEscolha: ";
		return menu;
	}
}