import java.util.Scanner;

public class ex001 {
	
	public static void main(String[] args) {
	
	/**Ex 1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do
	que 10! ”, caso este número seja maior, ou “Número menor ou igual a 10! ”, caso este número seja menor ou igual.
	*/
	
	Scanner leitor = new Scanner(System.in);
	
	int numero;
	System.out.println("Diga um numero: ");
	numero = leitor.nextInt();
	
	if (numero > 10) {
		System.out.println("É maior que 10.");
	}else {
		System.out.println("É menor ou igual que 10.");
	}
	
	leitor.close();
	
	}
}