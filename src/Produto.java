import java.util.Scanner;
/**
 * 
 * @author eoliveira
 *
 */

public class Produto {
	private String nomeProd;
	private double precoProd;
	private String skuProduto; 

	public Produto() {
		setNomeProd(readString("Digite o nome do produto: "));
		setPrecoProd(Double.parseDouble(readString("Digite o preço do produto: ")));
		setSkuProduto(readString("Digite o SKU do produto: "));
	}

	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public double getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(double precoProd) {
		this.precoProd = precoProd;
	}	

	public String getSkuProduto() {
		return skuProduto;
	}

	public void setSkuProduto(String skuProduto) {
		this.skuProduto = skuProduto;
	}
	
	private static String readString(String msg) {
		Scanner a = new Scanner(System.in);
		System.out.println(msg);
		return a.nextLine();

	}

	@Override
	public String toString() {
		return "Nome: " + nomeProd + ", Preço: R$ " + precoProd + ", SKU: "+skuProduto;
	}	
}
