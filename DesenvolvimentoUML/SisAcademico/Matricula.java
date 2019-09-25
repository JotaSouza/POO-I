package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class Matricula {

	private int numero;
	protected List<Aluno> alunos;
	protected List<Avaliacao> avaliacoes;
	protected DisciplinaLecionada disciplinaLecionada;
	protected Frequencia frequencia;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public DisciplinaLecionada getDisciplinaLecionada() {
		return disciplinaLecionada;
	}
	public void setDisciplinaLecionada(DisciplinaLecionada disciplinaLecionada) {
		this.disciplinaLecionada = disciplinaLecionada;
	}
	public Frequencia getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [numero=");
		builder.append(numero);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append(", avaliacoes=");
		builder.append(avaliacoes);
		builder.append(", disciplinaLecionada=");
		builder.append(disciplinaLecionada);
		builder.append(", frequencia=");
		builder.append(frequencia);
		builder.append("]");
		return builder.toString();
	}

}
