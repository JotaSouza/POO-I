package DesenvolvimentoUML.SisVotacao;

import java.util.ArrayList;

public class Candidato {

	protected Usuario usuario;
	protected ArrayList<Votacao> votacoes;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Votacao> getVotacoes() {
		return votacoes;
	}
	public void setVotacoes(ArrayList<Votacao> votacoes) {
		this.votacoes = votacoes;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidato [usuario=");
		builder.append(usuario);
		builder.append(", votacoes=");
		builder.append(votacoes);
		builder.append("]");
		return builder.toString();
	}
	
}
