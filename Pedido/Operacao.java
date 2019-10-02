package Pedido;

import java.util.Date;

public class Operacao {

	private Date dataInicio;
	private Date dataFim;
	
	public Operacao(Date inicio, Date fim) {
		this.dataInicio = inicio;
		this.dataFim = fim;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [dataInicio=");
		builder.append(dataInicio);
		builder.append(", dataFim=");
		builder.append(dataFim);
		builder.append("]");
		return builder.toString();
	}
}
