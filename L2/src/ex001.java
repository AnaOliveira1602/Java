import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		
		rodarex001();
}
	public static void rodarex001() {
		
		/**
		 Ex 1. Escreva um algoritmo que leia uma sequência finita de números e mostre posi�vo, nega�vo ou zero para
cada número.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int qnt = 3;
		//int[] vetor = {8, 5, -3};
		int[] vetor = new int[qnt];
		
		//repetidor para preencher o vetor
		int contador = 0;
		while(contador < qnt) {
			System.out.println("Informe o numero " + (contador + 1) + " de " + qnt + ":");
			vetor[contador] = leitor.nextInt();
			contador++;
		}
		
		//repetidor para mostrar o tipo do numero
		for(int i = 0; i < qnt; i++) {
		
			int numero = vetor[i];
			if (numero < 0) {
				System.out.println("Negativo");
			}else if(numero == 0) {
				System.out.println("zero");
			}else {
				System.out.println("Positivo");
			}
			leitor.close();
		}
		
	}
	
	
}
