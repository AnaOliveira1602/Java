import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
	/** Ex 3. Escreva um algoritmo que leia os valores de dois números inteiros dis�ntos nas variáveis A e B e informe
	qual deles é o maior. Caso os números sejam iguais informar ao usuário que a sequência de números informados éinválida.
	*/	
		
		Scanner leitor = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Diga o valor de A: ");
		a = leitor.nextInt();
		
		System.out.println("Diga o valor de B: ");
		b = leitor.nextInt();
		
		if(a == b) {
			System.out.println("A sequencia de numeros informada é invalida");
		}else {
			if(a > b) {
				System.out.println("A é maior que B");
			}else {
				System.out.println("A é menor que B");
			}
		}
		
		leitor.close();
	}

}