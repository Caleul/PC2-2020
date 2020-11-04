package trabalho2;

public class DataPadraoBrasil {
	public String dia;
	public String mes;
	public String ano;
	public DataPadraoBrasil(String dia, String mes, String ano) {
	super();
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	}
	
	@Override
	public String toString() {
	return dia+"/"+mes+"/"+ano;
	}
}
