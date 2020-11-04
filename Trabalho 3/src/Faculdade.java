package trabalho3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Faculdade {

	public static void main(String[] args) {
	
		String ctps = null;
		String nome = null;
		String formacao = null;
		double valor_aula = 0;
		double qtd_hora_aula = 0;
		double salario_base = 0;
		double dsr = 0;
		double act = 0;
		double desconto_inss = 0;
		double desconto_irpf = 0;
		double svc = 0;
		double salario_bruto = 0;
		double salario_base_inss = 0;
		double salario_base_fgts = 0;
		double salario_base_irpf = 0;
		double valor_fgts = 0;
		double salario_liquido = 0;
		double qtd_dependente = 0;
		
		
		Professor p1 = new Professor(ctps, nome, formacao);
	
		ContraCheque ct = new ContraCheque(valor_aula, qtd_hora_aula, qtd_dependente);
		
		List<Professor> lista_de_professores = new ArrayList<Professor>();
		
		while(true) {
			
			int cadastrar = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar cadastrando ou 0 para sair"));
			if(cadastrar == 0 ) {//checando se a cadastrar for igual a zero pode sair do sistema, se não fica recebendo
				break;
			}
		p1.ctps = JOptionPane.showInputDialog("Digite o ctps");
	
		p1.nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		p1.formacao = JOptionPane.showInputDialog("Digite a sua formação");
		
		ct.valor_aula = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da aula"));
		
		ct.qtd_hora_aula = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas aulas"));
		
		ct.qtd_dependente = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Dependentes"));
		
		salario_base = ct.calcula_salario_base(ct.valor_aula, ct.qtd_hora_aula);
		dsr = ct.Descanso_semanal_remunerado(salario_base);
		act = ct.Acordo_coletivo_trabalho(salario_base);
		desconto_inss = ct.desconto_inss(salario_base);
		desconto_irpf = ct.desconto_irpf(salario_base,desconto_inss, ct.qtd_dependente);
		svc = ct.calcula_svc(salario_base);
		salario_bruto = ct.calcula_renda_bruta(salario_base, ct.valor_aula, ct.qtd_hora_aula);
		salario_base_inss = ct.desconto_inss(salario_base);
		salario_base_fgts = ct.calcula_fgts(salario_base);
		salario_base_irpf = ct.calcula_irpf(ct.valor_aula, ct.qtd_hora_aula);
		valor_fgts = ct.calcula_fgts(salario_base);
		salario_liquido = ct.salario_liquido(salario_base,desconto_inss,desconto_irpf,svc);
		
		System.out.println(salario_base);
		System.out.println(dsr);
		System.out.println(act);
		System.out.println(desconto_inss);
		System.out.println(desconto_irpf);
		System.out.println(svc);
		System.out.println(salario_bruto);
		System.out.println(salario_base_inss);
		System.out.println(salario_base_fgts);
		System.out.println(salario_base_irpf);
		System.out.println(valor_fgts);
		System.out.println(salario_liquido);
		
		JOptionPane.showMessageDialog(null, p1);
		System.out.println(p1);
		lista_de_professores.add(p1);
		
		
		}	
	}
	}

