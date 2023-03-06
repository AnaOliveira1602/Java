import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		/** Ex 4. Escreva um algoritmo que leia dois números e ao final 
		mostre a soma, subtração, mul�plicação e a divisãodos números lidos. 
		 */
		Scanner leitor = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		int menos;
		int mult;
		int div;
		
		System.out.println("Diga o primeiro numero: ");
		num1 = leitor.nextInt();
		
		System.out.println("Diga o segundo numero: ");
		num2 = leitor.nextInt();
		
		soma = num1 + num2;
		menos = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + menos);
		System.out.println("A multiplicação é: " + mult);
		System.out.println("A divisão é: " + div);
		
	leitor.close();
	}
	
}
