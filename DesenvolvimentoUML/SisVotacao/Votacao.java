package DesenvolvimentoUML.SisVotacao;

import java.util.ArrayList;

public class Votacao {

	protected ArrayList<Voto> votos;
	protected ArrayList<Validacao> validacoes;
	protected ArrayList<Candidato> candidatos;
	protected ArrayList<Usuario> podeVotar;
	protected Usuario admin;
	protected Usuario votou;
	
	public ArrayList<Voto> getVotos() {
		return votos;
	}
	public void setVotos(ArrayList<Voto> votos) {
		this.votos = votos;
	}
	public ArrayList<Validacao> getValidacoes() {
		return validacoes;
	}
	public void setValidacoes(ArrayList<Validacao> validacoes) {
		this.validacoes = validacoes;
	}
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public ArrayList<Usuario> getPodeVotar() {
		return podeVotar;
	}
	public void setPodeVotar(ArrayList<Usuario> podeVotar) {
		this.podeVotar = podeVotar;
	}
	public Usuario getAdmin() {
		return admin;
	}
	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}
	public Usuario getVotou() {
		return votou;
	}
	public void setVotou(Usuario votou) {
		this.votou = votou;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Votacao [votos=");
		builder.append(votos);
		builder.append(", validacoes=");
		builder.append(validacoes);
		builder.append(", candidatos=");
		builder.append(candidatos);
		builder.append(", podeVotar=");
		builder.append(podeVotar);
		builder.append(", admin=");
		builder.append(admin);
		builder.append(", votou=");
		builder.append(votou);
		builder.append("]");
		return builder.toString();
	}
	
}
