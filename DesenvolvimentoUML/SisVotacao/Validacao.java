package DesenvolvimentoUML.SisVotacao;

public class Validacao {

	private String hash;
	private boolean ativo;
	protected Votacao votacao;
	protected Usuario usuario;
	
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Votacao getVotacao() {
		return votacao;
	}
	public void setVotacao(Votacao votacao) {
		this.votacao = votacao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Validacao [hash=");
		builder.append(hash);
		builder.append(", ativo=");
		builder.append(ativo);
		builder.append(", votacao=");
		builder.append(votacao);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append("]");
		return builder.toString();
	}
	
}
