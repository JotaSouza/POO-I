package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class DisciplinaLecionada {

	private int ano;
	private int semestre;
	protected Disciplina disciplina;
	protected List<Matricula> matriculas;
	protected List<Professor> professores;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisciplinaLecionada [ano=");
		builder.append(ano);
		builder.append(", semestre=");
		builder.append(semestre);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append(", matriculas=");
		builder.append(matriculas);
		builder.append(", professores=");
		builder.append(professores);
		builder.append("]");
		return builder.toString();
	}
	
}
