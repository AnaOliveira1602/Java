import java.util.Scanner;

public class ExF2A2 {
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
		
	   String[] matri = new String[3];
	   String[] nomes = new String[3];
	   int[] notas1 = new int[3];
	   int[] notas2 = new int[3];
	   
	   for(int i = 0; i < 3; i++) {
		   System.out.println("Digite a Matricula: ");
		   matri[i] = leitor.nextLine();
		   
		   System.out.println("Digite o nome: ");
		   nomes[i] = leitor.nextLine();
		   
		   System.out.println("Digite a primeira nota: ");
		   notas1[i] = leitor.nextInt();
		   
		   System.out.println("Digite a segunda nota: ");
		   notas2[i] = leitor.nextInt();
		   
		   //força a quebra de linha.
		   leitor.nextLine();
	   }
	   
	   int contador = 0;
	   int qtde = 3;
	   while (contador < qtde) {
		   
		   System.out.println("Matricula: " + matri[contador]);
		   System.out.println("Nome: " + nomes[contador]);
		   
		   int notaFinal = (notas1[contador] + notas2[contador]) / 2;
		   
		   if(notaFinal >= 6) {
			   System.out.println("Aprovado: (x)Sim ()Não");
		   }else {
			   System.out.println("Aprovado: ()Sim (x)Não");
		   }
		   
		   System.out.println("Nota Final: " + notaFinal);
		  
		   contador++;
		   
	   }
	   
	   
	   leitor.close();
   }
   }
   
