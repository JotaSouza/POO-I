package DesenvolvimentoUML.CampeonatoBrasileiro;

import java.util.ArrayList;
import java.util.List;

public class Time {

	private String nome;
	protected Tecnico tecnico;
	protected List<Jogador> jogadores;
	
	public Time() {
		tecnico = new Tecnico();
		jogadores = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Time [nome=");
		builder.append(nome);
		builder.append(", tecnico=");
		builder.append(tecnico);
		builder.append(", jogadores=");
		builder.append(jogadores);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
