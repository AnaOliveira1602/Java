import java.util.Scanner;

public class ex002 {
	
	public static void main(String[] args) {
		
		rodarex002();
}
	public static void rodarex002() {

		/**Ex 2. Construa um programa que leia um vetor de 5 elementos e calcule a média destes valores. Na seqüência,
apresente na tela os valores que são iguais ou superiores à média.
		 */
		
		Scanner leitor = new Scanner(System.in);
		int qnt = 5;
		int[] vetor = new int[qnt];
		int total = 0;
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Infrme o elemento " + (i + 1) + ":");
			vetor[i] = leitor.nextInt();
			//total = total + vetor[i];
			total += vetor[i]; //em outras palavras -> total = vetor[i] + total
		}
		
		int media = total / qnt;
		
		for (int i = 0; i < vetor.length; i++) {
			int numero = vetor [i];
			if (numero == media) {
				System.out.println("Numero igual a media");
			}else if( numero > media) {
				System.out.println("Numero maior que a media");
			}else {
				System.out.println("Numero iferior a media");
			}
		}
		
		leitor.close();
	}
}
