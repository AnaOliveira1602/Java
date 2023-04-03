package Principal;

import Principal.pessoa.*;

public class programa {
public static void main(String[] args) {
		
		pessoa pessoaEu = new pessoa();
		pessoaEu.setNome("Ana");  
		pessoaEu.setCPF(55558722);
		pessoaEu.setPeso(70);
		
		pessoa pessoaVc = new pessoa();
		pessoaVc.setNome("Prof");  
		pessoaVc.setCPF(7775982);
		pessoaVc.setPeso(72);
		
		
		
		System.out.println("Nome: " + pessoaEu.getNome());
		System.out.println("CPF: " + pessoaEu.getCPF());
		System.out.println("Peso: " + pessoaEu.getPeso());
		
		System.out.println("Nome: " + pessoaVc.getNome());
		System.out.println("CPF: " + pessoaVc.getCPF());
		System.out.println("Peso: " + pessoaVc.getPeso());
		
		
}
}