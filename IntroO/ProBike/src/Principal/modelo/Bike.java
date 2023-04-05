package Principal.modelo;

public class Bike {

	private Quadro quadro;
	private Roda rodaDianteira;
	private Roda rodaTraseira;
	
	public Quadro getQuadro() {
		return quadro;
	}
	
	public Roda getrodaDianteira() {
		return rodaDianteira;
	}
	
	public Roda getrodaTraseira() {
		return rodaTraseira;
	}
	
	
	
	public void setQuadro(Quadro quadro) {
		this.quadro = quadro;
	}
	
	public void setroda(Roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}
	
	public void setRoda(Roda rodaTraseira) {
		this.rodaTraseira = rodaTraseira;
	}
	
}
