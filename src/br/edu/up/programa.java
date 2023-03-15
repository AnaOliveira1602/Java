package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) throws FileNotFoundException {
	
		File arquivo = new File("C:\\_src\\Adsmda\\A1\\exLeiTex\\src\\arquivo.txt");
		Scanner leitor = new Scanner(arquivo);
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			System.out.println("Nome Completo " + linha);
			
			for(int i = 0; i < linha.length(); i++) {
				char caractere = linha.charAt(i);
				System.out.println("Cractere: " + caractere);
			}
			
			System.out.println("Tamanho " + linha.length());
		}
		
		leitor.close();
	
	}
}
