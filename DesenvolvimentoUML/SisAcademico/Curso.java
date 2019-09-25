package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class Curso {

	private String nome;
	protected List<Aluno> alunos;
	protected List<Fase> fases;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append(", fases=");
		builder.append(fases);
		builder.append("]");
		return builder.toString();
	}
	
}
