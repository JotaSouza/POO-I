package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class Fase {

	private int semestre;
	protected Curso curso;
	protected List<Disciplina> disciplinas;
	
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [semestre=");
		builder.append(semestre);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", disciplinas=");
		builder.append(disciplinas);
		builder.append("]");
		return builder.toString();
	}
	
}
