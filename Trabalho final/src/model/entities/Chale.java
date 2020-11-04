package model.entities;

import java.io.Serializable;

public class Chale implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer codChale;
	private String localizacao;
	private Integer capacidade;
	private Double valorAltaE;
	private Double valorBaixaE;
	
	public Chale() {
		
	}
	
	public Chale(Integer codChale, String localizacao, Integer capacidade, Double valorAltaE, Double valorBaixaE) {
	
		this.codChale = codChale;
		this.localizacao = localizacao;
		this.capacidade = capacidade;
		this.valorAltaE = valorAltaE;
		this.valorBaixaE = valorBaixaE;
	}

	public Integer getCodChale() {
		return codChale;
	}

	public void setCodChale(Integer codChale) {
		this.codChale = codChale;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Double getValorAltaE() {
		return valorAltaE;
	}

	public void setValorAltaE(Double valorAltaE) {
		this.valorAltaE = valorAltaE;
	}

	public Double getValorBaixaE() {
		return valorBaixaE;
	}

	public void setValorBaixaE(Double valorBaixaE) {
		this.valorBaixaE = valorBaixaE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codChale == null) ? 0 : codChale.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chale other = (Chale) obj;
		if (codChale == null) {
			if (other.codChale != null)
				return false;
		} else if (!codChale.equals(other.codChale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chale [codChale=" + codChale + ", localizacao=" + localizacao + ", capacidade=" + capacidade
				+ ", valorAltaE=" + valorAltaE + ", valorBaixaE=" + valorBaixaE + "]";
	}
	
	
	
	

}

