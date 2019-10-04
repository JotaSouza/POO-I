package AvaliacaoII;

public class Motorista {

	private String nome;
	
	public Motorista(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motorista [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
