package Lista2;

import java.util.Scanner;

public class Ex011 {
	public static void main(String[] args) {
	 try (/**. 11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros
				de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +
				8*9 = 140
					  */
		Scanner leitor = new Scanner(System.in)) {
			int[] vetor1 = new int[5];
			int[] vetor2 = new int[5];
			int i;
			
			System.out.println("Diga cinco numeros para o primeiro vetor: ");
			for(i = 0; i < 5; i++) {
				vetor1[i] = leitor.nextInt();
			}
			
			System.out.println("Diga cinco numeros para o segundo vetor: ");
			for(i = 0; i < 5; i++) {
				vetor2[i] = leitor.nextInt();
			}
			
			int calculo = 0;
			for(i = 0; i < vetor1.length; i++) {
			    calculo += vetor1[i] * vetor2[i];
			}

			System.out.println("O produto escalar entre os vetores é: " + calculo);
			
			leitor.close();
		}
		
	}
}
