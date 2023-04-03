package pacotePrin.modelos;

public class bicicleta {
	
	//quando vc priva, o modelo nao pode ser alterado sem autorização, em outras palavras vc protege, isso é Encapsulamento.
	private String modelo;
	private int velocidade;
	private int pedaladasPorMin;
	private int marcha;
	
	
	//para imprimir os dados da bike se usa o getters
			public String getModelo() {
				return modelo;
			}
			
			public int getVelocidade() {
				return velocidade;
			}
			
			public int getpedaladasPorMin() {
				return pedaladasPorMin;
			}
			
			public int getMarcha() {
				return marcha;
			}
			
			
	
	
	//exemplo de setter(definir):
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setVelocidade(int velocidade) {
		if(velocidade >= 0) {
		this.velocidade = velocidade;
		}
	}

	public void setPedaladasPorMin (int pedaladas) {
		this.pedaladasPorMin = pedaladas;
	}
	
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

}