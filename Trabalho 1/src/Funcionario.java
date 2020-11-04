public class Funcionario {
	Integer matricula;
	String nome;
	String cargo;
	DataPadraoBrasil dataDeNascimento;
	
	//Constructor
	public Funcionario(Integer matricula, String nome, String cargo, DataPadraoBrasil dataDeNascimento) {
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	@Override
	public String toString() {
		return " matricula: " + matricula + "\n nome: " + nome + "\n cargo: " + cargo + "\n data de nascimento: " + dataDeNascimento;
	}
}