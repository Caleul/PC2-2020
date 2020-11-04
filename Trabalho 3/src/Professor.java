package trabalho3;

public class Professor {
	String ctps;
	String nome;
	String formacao;
	
	
	//criando o construtor
	
	public Professor(String ctps, String nome, String formacao) {
		this.ctps = ctps;
		this.nome = nome;
		this.formacao = formacao;
	}

	//criando metodo para imprimir
	
	@Override
	public String toString() {
		return "Professor [ctps=" + ctps + ", nome=" + nome + ", formacao=" + formacao + "]";
	}
	
	
}

