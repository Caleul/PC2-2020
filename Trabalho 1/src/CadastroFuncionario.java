
public class CadastroFuncionario {

	public static void main(String[] args) {
		DataPadraoBrasil d1 = new DataPadraoBrasil(17, 05, 1999);
		Funcionario f1 = new Funcionario(129, "caleul", "estagiario", d1);
		
		System.out.println(f1);
		
	}

}
