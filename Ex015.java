package Lista2;

import java.util.Scanner;

public class Ex015 {
	public static void main(String[] args) {
	try (/**15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
		acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
		um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
		valor lido só poderá ser maior que 5.
			 */
		Scanner leitor = new Scanner(System.in)) {
			int i;
			int[] vetor = new int[5];
			
			System.out.println("Diga os 5 numeros: ");
			// Lendo o primeiro número e armazenando no vetor
			vetor[0] = leitor.nextInt();

			// Lendo os demais números e verificando se são maiores que o anterior
			int anterior = vetor[0];
			for (i = 1; i < vetor.length; i++) {
			    int numero = leitor.nextInt();
			    if (numero > anterior) {
			        vetor[i] = numero;
			        anterior = numero;
			    } else {
			        System.out.println("Número inválido. Digite novamente:");
			        i--;
			    }
			}

			// Imprimindo o vetor preenchido na tela
			System.out.println("Vetor preenchido:");
			for (i = 0; i < vetor.length; i++) {
			    System.out.print(vetor[i] + " ");
			}
			
			leitor.close();
		}
}
}
