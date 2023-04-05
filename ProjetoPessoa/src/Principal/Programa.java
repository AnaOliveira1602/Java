package Principal;

import Principal.Modelo.*;

public class Programa {
	public static void main(String[] args) {
		
		Pessoa pessoaEu = new Pessoa();
		pessoaEu.setNome("Shoyo Hinata");  
		pessoaEu.setCPF("55558722");
		pessoaEu.setPeso(70);
		
		Pessoa pessoaVc = new Pessoa();
		pessoaVc.setNome("Prof");  
		pessoaVc.setCPF("7775982");
		pessoaVc.setPeso(72);
		
		Pessoa pessoaPedro = new Pessoa();
		pessoaPedro.setNome("Pedro");  
		pessoaPedro.setCPF("0008292");
		pessoaPedro.setPeso(70);
		
		Pessoa pessoaAna = new Pessoa();
		pessoaAna.setNome("Ana");
		pessoaAna.setCPF("5678291");
		pessoaAna.setPeso(65);
		
		Pessoa pessoaCarlos = new Pessoa();
		pessoaCarlos.setNome("Carlos");  
		pessoaCarlos.setCPF("3645578");
		pessoaCarlos.setPeso(80);
		
		Pessoa pessoaTu = new Pessoa();
		pessoaTu.setNome("Tuzinho");  
		pessoaTu.setCPF("5557872");
		pessoaTu.setPeso(85);
		
		Pessoa pessoaEle = new Pessoa();
		pessoaEle.setNome("Elezinho");  
		pessoaEle.setCPF("9971562");
		pessoaEle.setPeso(90);
		
		
		
		System.out.println("Nome: " + pessoaEu.getNome());
		System.out.println("CPF: " + pessoaEu.getCPF());
		System.out.println("Peso: " + pessoaEu.getPeso());
		System.out.println();
		
		System.out.println("Nome: " + pessoaVc.getNome());
		System.out.println("CPF: " + pessoaVc.getCPF());
		System.out.println("Peso: " + pessoaVc.getPeso());
		System.out.println();
		
		System.out.println("Nome: " + pessoaPedro.getNome());
		System.out.println("CPF: " + pessoaPedro.getCPF());
		System.out.println("Peso: " + pessoaPedro.getPeso());
		System.out.println();
		
		System.out.println("Nome: " + pessoaAna.getNome());
		System.out.println("CPF: " + pessoaAna.getCPF());
		System.out.println("Peso: " + pessoaAna.getPeso());
		System.out.println();
		
		System.out.println("Nome: " + pessoaCarlos.getNome());
		System.out.println("CPF: " + pessoaCarlos.getCPF());
		System.out.println("Peso: " + pessoaCarlos.getPeso());
		System.out.println();
		
		System.out.println("Nome: " + pessoaTu.getNome());
		System.out.println("CPF: " + pessoaTu.getCPF());
		System.out.println("Peso: " + pessoaTu.getPeso());
		System.out.println();
		
		System.out.println("Nome: " + pessoaEle.getNome());
		System.out.println("CPF: " + pessoaEle.getCPF());
		System.out.println("Peso: " + pessoaEle.getPeso());
		System.out.println();
		
}
}