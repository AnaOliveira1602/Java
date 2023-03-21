package Lista2;

import java.util.Scanner;

public class Ex013 {
	public static void main(String[] args) {
		/**13. Elabore um algoritmo que receba um número n e retorne um vetor com os n
primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 4, 8,
13, 21}.
		 */
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor de n: ");
        int n = leitor.nextInt();

        int[] fibo = new int[n];
        fibo[0] = 1;
        if (n > 1) {
            fibo[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.print("A sequência de Fibonacci é: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
		
		
		
		
		leitor.close();
	}
}
