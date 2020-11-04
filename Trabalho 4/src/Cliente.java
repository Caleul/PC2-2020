package trabalho4;

public class Cliente {
	private String codigo;
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String pedcli;
	
	
	public Cliente(String codigo, String nome, String endereco, String cidade, String estado, String cep,
			String telefone, String pedcli) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.pedcli = pedcli;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getPedcli() {
		return pedcli;
	}
	
	public void setPedcli(String pedcli) {
		this.pedcli = pedcli;
	}
	
	public void inserir(){}
	public void consultar(){}
	public void alterar(){}
	public void excluir(){}
	public void efetuarPedidoCliente(){}
	public void efetuarPagamento(){}
	
}
