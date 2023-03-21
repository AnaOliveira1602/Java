package Lista2;

import java.util.Scanner;

public class Ex014 {
	public static void main(String[] args) {
		try (/**14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
		o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
		apagado ou duplicado. Apresente o vetor atualizado na tela.
				 */
		Scanner leitor = new Scanner(System.in)) {
			int[] vetor = new int[5];
			int i;
			int maior = vetor[0];
			int ultimaPs = 0;
			
			for(i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + "º elemento: ");
			vetor[i] = leitor.nextInt();
			
			if(vetor[i] > maior) {
				maior = vetor[i];
				ultimaPs = i;
			}
}
			
			vetor[ultimaPs] = vetor[4];
			vetor[4] = maior;
			
			System.out.println("Vetor atualizado: ");
			for (i = 0; i < vetor.length; i++) {
			    System.out.print(vetor[i] + " ");
			}
			
			
			leitor.close();
		}
	}
}
