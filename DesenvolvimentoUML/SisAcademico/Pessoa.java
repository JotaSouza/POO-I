package DesenvolvimentoUML.SisAcademico;

public class Pessoa {

	private String nome;
	private int cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null)
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
	
}
