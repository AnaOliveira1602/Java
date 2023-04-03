package pacotePrin;

import pacotePrin.modelos.*;

public class programa {
	public static void main(String[] args) {
		
		bicicleta minhaBk = new bicicleta();
		minhaBk.setModelo("Caloi");  //deu erro na primeira vez pq esta Encapsulamento e nao pode ser alterado, teria que ser public para funcionar.
		minhaBk.setVelocidade(0);//neste momento
		minhaBk.setMarcha(1);//neste momento
		minhaBk.setPedaladasPorMin(0);//neste momento
		//para acessar uma classe encapsulada deve-se usar os getters e setters.
		
		//imprimir os dados
		System.out.println("Modelo: " + minhaBk.getModelo());
		System.out.println("Velocidade: " + minhaBk.getVelocidade());
		System.out.println("Marcha: " + minhaBk.getMarcha());
		System.out.println("Pedaladas por minuto: " + minhaBk.getpedaladasPorMin());
		
		
		
		//minhaBk.setVelocidade(20);//20 min depois
		
	}
}
