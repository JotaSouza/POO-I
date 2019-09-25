package DesenvolvimentoUML.SisAcademico;

import java.util.List;

public class Aluno extends Pessoa {

	protected List<Curso> curso;
	protected Matricula matricula;
	
	public List<Curso> getCursos() {
		return curso;
	}
	public void setCursos(List<Curso> cursos) {
		this.curso = cursos;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [cursos=");
		builder.append(curso);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
