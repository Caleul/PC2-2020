package trabalho2;

public class Aluno {
	 Integer matricula;
	 String nome;
	 DataPadraoBrasil data_nascimento;
	
	
	public Aluno(DataPadraoBrasil data_nascimento, Integer matricula, String nome) {
		this.data_nascimento = data_nascimento;
		this.matricula = matricula;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Matricula do Aluno: "+ matricula + ""
				+ " Nome do Aluno: " 
				+ nome  + " data de nascimento do Aluno: " 
				+ data_nascimento;
	}
	
	
}


