package trabalho4;


import java.util.Date;
import java.util.List;


public class PedidoCliente extends Pedido {
	private Cliente codCliente;
	private Date dataRemessa;
	


	public PedidoCliente(Balconista balcao, Integer codigo, Date datapedido, List<Livro> listalivro, Integer quantidade,
			Double valor, Cliente codcliente, Date dataremessa) {
		super(balcao, codigo, datapedido, listalivro, quantidade, valor);
		this.codCliente = codcliente;
		this.dataRemessa = dataremessa;
	}
	
	
	public Cliente getCodCliente() {
		return codCliente;
	}
	
	public void setCodCliente(Cliente codCliente) {
		this.codCliente = codCliente;
	}
	
	public Date getDataRemessa() {
		return dataRemessa;
	}
	
	public void setDataRemessa(Date dataRemessa) {
		this.dataRemessa = dataRemessa;
	}
	
	public int pagamentoCliente() {
		return 0;
	
		
	}
	
	public int remessaCliente() {
		return 0;
		
	}
	
	public int recuperarPedCliente() {
		return 0;
		
	}


	@Override
	public String toString() {
		return "PedidoCliente [codCliente=" + codCliente + ", dataRemessa=" + dataRemessa + ", balcao=" + balcao
				+ ", codigo=" + codigo + ", datapedido=" + datapedido + ", listalivro=" + listalivro + ", quantidade="
				+ quantidade + ", valor=" + valor + "]";
	}



}

