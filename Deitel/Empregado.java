package Deitel;

import java.util.Date;

public class Empregado {
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private Date dataContratacao;
	
	// construtor para inicializar nome, data de nascimento e data de contratação
	public Empregado(String nome, String sobrenome, Date dataNascimento, Date dataContratacao){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.dataContratacao = dataContratacao;	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empregado [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", dataContratacao=");
		builder.append(dataContratacao);
		builder.append("]");
		return builder.toString();
	}
}
