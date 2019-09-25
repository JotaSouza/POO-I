package DesenvolvimentoUML.SisAcademico;

public class Avaliacao {

	private float nota;
	private float peso;
	protected Matricula matricula;
	protected Professor professor;
	
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
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
		builder.append("Avaliacao [nota=");
		builder.append(nota);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", professor=");
		builder.append(professor);
		builder.append("]");
		return builder.toString();
	}
	
}
