public class DataPadraoBrasil {
	Integer dia;
	Integer mes;
	Integer ano;
	public DataPadraoBrasil(Integer dia, Integer mes, Integer ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	}
	
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
		}

}