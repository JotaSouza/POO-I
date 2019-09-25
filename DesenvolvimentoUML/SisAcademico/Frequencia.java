package DesenvolvimentoUML.SisAcademico;

import java.util.Date;
import java.util.List;

public class Frequencia {

	private Date dataHora;
	private int aulas;
	private int faltas;
	protected List<Matricula> matriculas;
	protected Professor professor;
	
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [dataHora=");
		builder.append(dataHora);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append(", faltas=");
		builder.append(faltas);
		builder.append(", matriculas=");
		builder.append(matriculas);
		builder.append(", professor=");
		builder.append(professor);
		builder.append("]");
		return builder.toString();
	}
	
}
