package ExCampeonatoBrasileiro;

import java.util.Date;

public class Jogo {

	private Date data;
	protected Serie serie;
	protected Estadio estadio;
	protected TimeJogo mandante;
	protected TimeJogo visitante;
	
	public Jogo() {
		serie = new Serie();
		estadio = new Estadio();
		mandante = new TimeJogo();
		visitante = new TimeJogo();
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	public TimeJogo getMandante() {
		return mandante;
	}
	public void setMandante(TimeJogo mandante) {
		this.mandante = mandante;
	}
	public TimeJogo getVisitante() {
		return visitante;
	}
	public void setVisitante(TimeJogo visitante) {
		this.visitante = visitante;
	}
	
	public String verifica() {
		if(mandante.getGol() == visitante.getGol())
			return "Empate";
		else if (mandante.getGol() > visitante.getGol())
			return mandante.getNome() + "ganhou";
		else
			return	visitante.getNome() + "ganhou";
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogo [data=");
		builder.append(data);
		builder.append(", serie=");
		builder.append(serie);
		builder.append(", estadio=");
		builder.append(estadio);
		builder.append(", mandante=");
		builder.append(mandante);
		builder.append(", visitante=");
		builder.append(visitante);
		builder.append("]");
		return builder.toString();
	}
	
}
