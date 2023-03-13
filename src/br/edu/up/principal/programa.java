package br.edu.up.principal;

import java.util.Scanner;
//import br.edu.up.util.Biblioteca;
import br.edu.up.util.Calculadora;

public class programa {
	
	public static void main(String[] args) {
	
		
		int num1 = 0;
		int num2 = 0;
		
		//é a criação de um objeto chamado leitor.
		//é um objeto quando usa a palavra new.
		Scanner leitor = new Scanner(System.in);
		
		//usar o metodo nextInt().
		System.out.println("Diga o primeiro numero: ");
		num1 = leitor.nextInt();
		
		System.out.println("Diga o segundo numero: ");
		num2 = leitor.nextInt();
		
		/**int total;
		
		total = num1 + num2;*/
		
		//int total = num1 + num2;
		
		
		//programação funcional, focado para funções
		//uso de biblioteca para realizar as funções.
		/**double total = Biblioteca.somar(num1, num2);
		System.out.println("O resultado é: " + total);
		total = Biblioteca.sub(num1,  num2);
		System.out.println("O resultado é: " + total);
		total = Biblioteca.mult(num1,  num2);
		System.out.println("O resultado é: " + total);
		total = Biblioteca.divi(num1,  num2);
		System.out.println("O resultado é: " + total);*/
		
		//programação orientada a objetos
		//uso do objeto Calculadora para realizar as operações
		Calculadora calc = new Calculadora();
		double total = calc.somar(num1, num2);
		System.out.println("O resultado é: " + total);
		total = calc.sub(num1,  num2);
		System.out.println("O resultado é: " + total);
		total = calc.mult(num1,  num2);
		System.out.println("O resultado é: " + total);
		total = calc.divi(num1,  num2);
		System.out.println("O resultado é: " + total);
		
		//uso do metodo close().
		leitor.close();
	}
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
}



