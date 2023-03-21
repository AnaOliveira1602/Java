package Lista2;

import java.util.Scanner;

public class Ex012 {
	public static void main(String[] args) {
	try (/**12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o
		produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -
		6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840
			 */
		Scanner leitor = new Scanner(System.in)) {
			int[] vetor = new int[12];
			int i;
			int calculo = 1;
			
			for(i = 0; i < 12; i++) {
				System.out.print("Digite o " + (i+1) + "º elemento: ");
				vetor[i] = leitor.nextInt();
			}
			

	        for (i = 0; i < vetor.length; i++) {
	            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
	                calculo *= vetor[i];
	            }
	        }

			System.out.println("O resultado é: " + calculo);
			
			
			
			
leitor.close();
		}
}
}
