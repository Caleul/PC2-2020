package trabalho2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastraAluno {

	public static void main(String[] args) {
		Aluno CadastraAluno;//
		
		List<Aluno> lista_de_aluno = new ArrayList<Aluno>();
		
		while(true){
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula"));
			if(matricula == 0 ) {//checando se a matricula for igual a zero pode sair do sistema, se não fica recebendo
				break;
			}
			
			String nome = JOptionPane.showInputDialog("Digite o nome");
			
			String dia = JOptionPane.showInputDialog("Digite o dia do nascimento");
			
			String mes = JOptionPane.showInputDialog("Digite o mês do nascimento");
			
			String ano = JOptionPane.showInputDialog("Digite o ano do nascimento");
			
			DataPadraoBrasil data_nascimento = new DataPadraoBrasil(dia, mes, ano);
			
			CadastraAluno = new Aluno(data_nascimento,matricula, nome);
			
			JOptionPane.showMessageDialog(null, CadastraAluno);
			System.out.println(CadastraAluno);
			lista_de_aluno.add(CadastraAluno);	
		
		System.out.printf("Quantidade de alunos = %d",lista_de_aluno.size()); //Quantidade de Alunos que foi digitado
	}//Mostra a quantidade de alunos que foi inserido no laço while.
}
}
