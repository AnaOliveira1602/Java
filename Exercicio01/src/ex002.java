import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		
		/**Ex 2. Escreva um algoritmo que leia dois números
		digitados pelo usuário e exiba o resultado da sua soma.
		*/
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Diga o primeiro numero: ");
		numero1 = leitor.nextInt();
		
		System.out.println("Diga o segundo numero: ");
		numero2 = leitor.nextInt();
		
		int total = numero1 + numero2;
		
		System.out.println("A soma é: " + total);
		
		leitor.close();
	}
}