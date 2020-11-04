package trabalho4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pedido {
	
	protected Balconista balcao;
	protected Integer codigo;
	protected Date datapedido;
	protected List<Livro> listalivro = new ArrayList<>();
	protected double quantidade;
	protected double valor;
	
	

	public Pedido(Balconista balc, Integer codigo, Date datapedido, List<Livro> listalivro, Integer quantidade,
			Double valor) {
		this.balcao = balc;
		this.codigo = codigo;
		this.datapedido = datapedido;
		this.listalivro = listalivro;
		this.quantidade = quantidade;
		this.valor = valor;
	}


	public double calcvalor(double quantidade, double valor) {
		return valor;
		
	}
	
	
	public Balconista getBalc() {
		return balcao;
	}
	

}
