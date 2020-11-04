package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Hospedagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer codHospedagem;
	private Integer codChale;
	private String estado;
	private Date dataInicio;
	private Date dataFim;
	private Integer qtdPessoas;
	private Double desconto;
	private Double valorFinal;
	
	public Hospedagem (){
		
	}
	
	public Hospedagem(Integer codHospedagem, Integer codChale, String estado, Date dataInicio, Date dataFim,
			Integer qtdPessoas, Double desconto, Double valorFinal) {
	
		this.codHospedagem = codHospedagem;
		this.codChale = codChale;
		this.estado = estado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.qtdPessoas = qtdPessoas;
		this.desconto = desconto;
		this.valorFinal = valorFinal;
	}

	public Integer getCodHospedagem() {
		return codHospedagem;
	}

	public void setCodHospedagem(Integer codHospedagem) {
		this.codHospedagem = codHospedagem;
	}

	public Integer getCodChale() {
		return codChale;
	}

	public void setCodChale(Integer codChale) {
		this.codChale = codChale;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codHospedagem == null) ? 0 : codHospedagem.hashCode());
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
		Hospedagem other = (Hospedagem) obj;
		if (codHospedagem == null) {
			if (other.codHospedagem != null)
				return false;
		} else if (!codHospedagem.equals(other.codHospedagem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hospedagem [codHospedagem=" + codHospedagem + ", codChale=" + codChale + ", estado=" + estado
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", qtdPessoas=" + qtdPessoas + ", desconto="
				+ desconto + ", valorFinal=" + valorFinal + "]";
	}
	
	
	

}
