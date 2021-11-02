public class Fecha {
	protected String dia;
	protected String mes;
	protected String anio;

	public Fecha (String dia, String mes, String anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);	
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getMes() {
		return mes;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAnio() {
		return anio;
	}
}
