package principal;

import java.sql.*;

public class Programa {
		
		public static void main(String[] args){
			
		Pessoa p = new Pessoa(6, "Davi", "98765432130", 70.0);
		
		//ApagarPessoa(6);
		
		AtualizarPessoa(p);
			
		//SalvarPessoa(p);
		
		ListarPessoas();
		
		}
		
		
public static void ApagarPessoa(int Id){
			try {
				String url="jdbc:mysql://localhost:3306/exemplo";
				String usuario = "root";
				String senha = "positivo";
				
				String sql = "DELETE FROM pessoa WHERE `id` = ?;";
				

				// 1. Abrir a conexão com o banco'
				Connection con = DriverManager.getConnection(url, usuario, senha);

				// 2. Criar o comando e executar a consulta			
				PreparedStatement comando = con.prepareStatement(sql);			
				comando.setInt(1, Id);
				
				comando.executeUpdate();	
				
				comando.close();
				con.close();
				System.out.println("Deu tudo certo!");

			} catch (Exception erro) {
				System.out.println("Algo deu errado!");
				//System.out.println(erro);
			}

		}
		
public static void AtualizarPessoa(Pessoa Pessoa){
			try {
				String url="jdbc:mysql://localhost:3306/exemplo";
				String usuario = "root";
				String senha = "positivo";
				
				String sql = "UPDATE `exemplo`.`pessoa` SET `Nome` = '?', `CPF` = '?', `Peso` = ? WHERE `Id` = ?;";
				
				//1 abrir a conexão com banco
				Connection con = DriverManager.getConnection(url, usuario, senha);
									
				PreparedStatement comando = con.prepareStatement(sql);
				comando.setString(1, Pessoa.getNome());
				comando.setString(2, Pessoa.getCPF());
				comando.setDouble(3, Pessoa.getPeso());
				
				comando.setInt(4, Pessoa.getId());
				
				comando.executeUpdate();
				System.out.println("Deu certo!");
				
				comando.close();
				con.close();
			}catch(Exception exception) {
				System.out.println("Algo deu errado");
			}

		}
		
		
		
public static void SalvarPessoa(Pessoa Pessoa){
	try {
		String url="jdbc:mysql://localhost:3306/exemplo";
		String usuario = "root";
		String senha = "positivo";
		
		String sql = "INSERT INTO `exemplo`.`pessoa` (`Nome`, `CPF`, `Peso`) VALUES (?, ?, ?);";
		
		//1 abrir a conexão com banco
		Connection con = DriverManager.getConnection(url, usuario, senha);
				
//		//2 criar o comando e exercutar a consulta
//		Statement comando = con.createStatement();
//		ResultSet resultado = comando.executeQuery("select * from pessoa");
//		
//		//3 utilizar os dados
//		while(resultado.next()){
//			int Id = resultado.getInt("ID");
//			String Nome = resultado.getString("Nome");
//			String CPF = resultado.getString("CPF");
//			double Peso = resultado.getDouble("Peso");
//			
//			System.out.println("---------------------------------");
//			System.out.println("Id: " + Id);
//			System.out.println("Nome: " + Nome);
//			System.out.println("CPF: " + CPF);
//			System.out.println("Peso: " + Peso);
//		}
//		
		PreparedStatement comando = con.prepareStatement(sql);
		comando.setString(1, Pessoa.getNome());
		comando.setString(2, Pessoa.getCPF());
		comando.setDouble(3, Pessoa.getPeso());
		
		comando.executeUpdate();
		System.out.println("Deu certo!");
		
		comando.close();
		con.close();
	}catch(Exception exception) {
		System.out.println("Algo deu errado");
	}

}


public static void ListarPessoas() {
	try {
		String url="jdbc:mysql://localhost:3306/exemplo";
		String usuario = "root";
		String senha = "positivo";
		
		String sql = "INSERT INTO `exemplo`.`pessoa` (`Nome`, `CPF`, `Peso`) VALUES (?, ?, ?);";
		
		//1 abrir a conexão com banco
		Connection con = DriverManager.getConnection(url, usuario, senha);
				
		//2 criar o comando e exercutar a consulta
		Statement comando = con.createStatement();
		ResultSet resultado = comando.executeQuery("select * from pessoa");
		
		//3 utilizar os dados
		while(resultado.next()){
			int Id = resultado.getInt("ID");
			String Nome = resultado.getString("Nome");
			String CPF = resultado.getString("CPF");
			double Peso = resultado.getDouble("Peso");
			
			System.out.println("---------------------------------");
			System.out.println("Id: " + Id);
			System.out.println("Nome: " + Nome);
			System.out.println("CPF: " + CPF);
			System.out.println("Peso: " + Peso);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
