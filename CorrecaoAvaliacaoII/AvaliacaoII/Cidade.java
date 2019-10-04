package AvaliacaoII;

public class Cidade {

	private String nome;
	
	public Cidade(String nome) {
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
		builder.append("Cidade [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}

}
