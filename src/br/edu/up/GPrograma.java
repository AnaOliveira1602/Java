package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import br.edu.up.entidades.gprograma;

public class GPrograma {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		String arquivoOrigem = "C:\\_src\\Adsmda\\A1\\EXEnti\\produtos.csv";
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] valores = linha.split(";");
			
			produtos produto = new produtos();
			produto.codigo = Integer.parseInt(valores[0]);
			produto.nome = valores[1];
			produto.marca = valores[2];
			produto.preco = Double.parseDouble(valores[3]);
			
			vetorDeprodutos[index] = produto;
			index++;
		}
		
		for(int i = 0; i < vetorDeProdutos.length; i++) {
			System.out.println("Codigo: " + produtos.codigo);
			System.out.println("Nome: " + produtos.nome);
			System.out.println("Marca: " + produtos.marca);
			System.out.println("Preço: " + produtos.preco);
			System.out.println();
		}
		
		leitor.close();
	}
	
	
	
	/*public static void main(String[] args) {
		
		gprograma meuProduto = new gprograma();
		meuProduto.codigo = 1;
		meuProduto.nome = "Computador";
		meuProduto.marca = "Acer";
		meuProduto.preco = 3925.00;
		
		gprograma seuProduto = new gprograma();
		seuProduto.codigo = 2;
		seuProduto.nome = "Celular";
		seuProduto.marca = "Samsung";
		seuProduto.preco = 6800.00;
		
		System.out.println("Meu produto");
		System.out.println("Codigo: " + meuProduto.codigo);
		System.out.println("Nome: " + meuProduto.nome);
		System.out.println("Marca: " + meuProduto.marca);
		System.out.println("Preço: " + meuProduto.preco);
		System.out.println();
		
		System.out.println("Seu produto");
		System.out.println("Codigo: " + seuProduto.codigo);
		System.out.println("Nome: " + seuProduto.nome);
		System.out.println("Marca: " + seuProduto.marca);
		System.out.println("Preço: " + seuProduto.preco);
		System.out.println();
		
	}*/
}
