package trabalho4;

public class Livro {
	private String codigo;
	private String titulo;
	private String autor;
	private String isbn;
	private double preco;
	private String cod_fornecedor;
	

	public Livro(String codigo, String titulo, String autor, String isbn, double preco, String cod_fornecedor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
		this.cod_fornecedor = cod_fornecedor;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCod_fornecedor() {
		return cod_fornecedor;
	}
	public void setCod_fornecedor(String cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}
	
	public void inserir() {}
	public void excluir() {}
	public void alterar() {}
	public void consultar() {}
	
}
