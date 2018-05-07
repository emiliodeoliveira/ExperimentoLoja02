package com.loja02.itens;
import java.util.Scanner;

import com.loja02.interfaces.Interfaces;
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
		setNomeProd(Interfaces.readString("Digite o nome do produto: "));
		setPrecoProd(Double.parseDouble(Interfaces.readString("Digite o preço do produto: ")));
		setSkuProduto(Interfaces.readString("Digite o SKU do produto: "));
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

	@Override
	public String toString() {
		return "Nome: " + nomeProd + ", Preço: R$ " + precoProd + ", SKU: "+skuProduto;
	}	
}
