package principal;

public class Pessoa {

	private int Id;
	private String Nome;
	private String CPF;
	private double Peso;
	
	public Pessoa(String Nome, String CPF, double Peso) {
		this.Nome = Nome;
		this.CPF = CPF;
		this.Peso = Peso;
	}
	
	public Pessoa(int Id, String Nome, String CPF, double Peso) {
		this.Id = Id;
		this.Nome = Nome;
		this.CPF = CPF;
		this.Peso = Peso;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		this.Peso = peso;
	}
	
	
	
	
	
	
}
