package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class Disciplina {

	private String nome;
	protected Fase fase;
	protected List<DisciplinaLecionada> disciplinasLecionadas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public List<DisciplinaLecionada> getDisciplinasLecionadas() {
		return disciplinasLecionadas;
	}
	public void setDisciplinasLecionadas(List<DisciplinaLecionada> disciplinasLecionadas) {
		this.disciplinasLecionadas = disciplinasLecionadas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", fase=");
		builder.append(fase);
		builder.append(", disciplinasLecionadas=");
		builder.append(disciplinasLecionadas);
		builder.append("]");
		return builder.toString();
	}
	
}
