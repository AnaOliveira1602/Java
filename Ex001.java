import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		/**▪ Transformar o programa do exercício 1 para um sistema que permita ler a
entrada de dados pelo usuário em um vetor durante execução;
▪ Permitir que o usuário informe, primeiro, os dados de 5 (cinco) alunos e depois
de capturados os dados, imprimir o relatório final com todos os dados:
Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
Nota final: xxxxx
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		String matri;
		String nome;
		int nota1;
		int nota2;
		
		System.out.print("Diga a primeira nota: ");
		nota1 = leitor.nextInt();
		
		leitor.close();
	}
	
}
