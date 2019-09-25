package DesenvolvimentoUML.SisVotacao;

import java.util.ArrayList;

public class Usuario {

	private String email;
	protected ArrayList<Validacao> validacoes;
	protected ArrayList<Candidato> candidatos;
	protected ArrayList<Votacao> podeVotar;
	protected ArrayList<Votacao> admin;
	protected ArrayList<Votacao> votou;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public ArrayList<Votacao> getPodeVotar() {
		return podeVotar;
	}
	public void setPodeVotar(ArrayList<Votacao> podeVotar) {
		this.podeVotar = podeVotar;
	}
	public ArrayList<Votacao> getAdmin() {
		return admin;
	}
	public void setAdmin(ArrayList<Votacao> admin) {
		this.admin = admin;
	}
	public ArrayList<Votacao> getVotou() {
		return votou;
	}
	public void setVotou(ArrayList<Votacao> votou) {
		this.votou = votou;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [email=");
		builder.append(email);
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
