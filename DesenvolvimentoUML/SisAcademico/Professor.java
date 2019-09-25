package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class Professor extends Pessoa {

	protected List<Avaliacao> avaliacoes;
	protected List<Frequencia> frequencias;
	protected List<DisciplinaLecionada> disciplinasLecionadas;
	
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public List<Frequencia> getFrequencias() {
		return frequencias;
	}
	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
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
		builder.append("Professor [avaliacoes=");
		builder.append(avaliacoes);
		builder.append(", frequencias=");
		builder.append(frequencias);
		builder.append(", disciplinasLecionadas=");
		builder.append(disciplinasLecionadas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
