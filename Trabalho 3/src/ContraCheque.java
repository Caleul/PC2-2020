package trabalho3;

public class ContraCheque {
	
	double valor_aula;
	double qtd_hora_aula;
	double salario_base;
	double renda_bruta;
	double salario_irpf;
	double qtd_dependente;
	double salario_liquido;
	double svc;
	double fgts;
	double irpf;
	double dsr;
	double act;
	
	
	//Construtor de contraCheque
	
	public ContraCheque(double valor_aula, double qtd_hora_aula, double qtd_dependente) {
		this.valor_aula = valor_aula;
		this.qtd_hora_aula = qtd_hora_aula;
		this.qtd_dependente = qtd_dependente;
	}


	//Metodo que calcula o salario base do profissional
	
	public double calcula_salario_base(double valor_aula, double qtd_hora_aula) {
		return  valor_aula*qtd_hora_aula*4.5;
	}
	
	
	
	//metodo que calcula a renda bruta
	
	public double calcula_renda_bruta(double salario_base, double valor_aula, double qtd_hora_aula) {
		return salario_base + salario_base*0.167+ salario_base*0.021 + valor_aula*qtd_hora_aula*0.2;
	}
	
	
	//metodo que calcula o desconto do inss
	
	public double desconto_inss(double renda_bruta) {
		if(renda_bruta<= 1045.00) {
			renda_bruta = renda_bruta*0.075;
		}
		if(renda_bruta>1045 && renda_bruta<= 2089.60) {
			renda_bruta = renda_bruta*0.09;
		}
		if(renda_bruta> 2089.60 && renda_bruta <= 3134.40) {
			renda_bruta = renda_bruta*0.12;
		}
		if(renda_bruta> 3134.40) {
			renda_bruta = renda_bruta*0.14;
		}
		return renda_bruta;
	}
	
	
	//Metodo que calcula o desconto do irpf
	
	public double desconto_irpf(double renda_bruta, double inss, double qtd_dependente) {
		return (renda_bruta - inss - (189.59*qtd_dependente));
	}
	
	
	//Metodo que calcula o irpf
	
	public double calcula_irpf(double salario_irpf, double irpf) {
		if(salario_irpf<=1903.98) {
			irpf = salario_irpf;
		}
		if(salario_irpf>1903.98 && salario_irpf<= 2826.65) {
			irpf = (salario_irpf*0.075-142.80);
		}
		if(salario_irpf>2826.65 && salario_irpf<= 3751.05) {
			irpf = (salario_irpf*0.15-354.80);
		}
		if(salario_irpf>3751.05 && salario_irpf<= 4664.68) {
			irpf = (salario_irpf*0.225-636.13);
		}
		if(salario_irpf>4664.68) {
			irpf = (salario_irpf*0.275-868.36);
		}
		return irpf;
	}
	
	
	//metodo que calcula o FGTS
	
	public double calcula_fgts(double renda_bruta) {
		return renda_bruta*0.08;
	}
	
	
	//metodo que calcula o svc
	
	public double calcula_svc(double renda_bruta) {
		return renda_bruta*0.2;
		
	}
	
	//metodo que calcula o salario liquido
	
	public double salario_liquido(double renda_bruta, double inss, double salario_irpf, double svc) {
		return renda_bruta-inss-salario_irpf-svc;
	}
	
	
	//metodo que calcula o DSR
	public double Descanso_semanal_remunerado(double renda_base) {
		return  renda_base*0.167;
		
	}
	
	//metodo que calcula o ACT
	public double Acordo_coletivo_trabalho(double renda_base) {
		return  renda_base*0.021;
		
	}
	


	
	
	
}
