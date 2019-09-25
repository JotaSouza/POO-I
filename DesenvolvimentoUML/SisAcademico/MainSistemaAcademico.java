package DesenvolvimentoUML.SisAcademico;

public class MainSistemaAcademico {

	public static void main(String[] args) {
		
		Pessoa pes1 = new Pessoa();
		pes1.setNome("Jônatas");
		pes1.setCpf(1234567891);
		System.out.println(pes1);
		
		Matricula matricula1 = new Matricula();
		matricula1.setNumero(2019006633);
		
		Curso curso1 = new Curso();
		curso1.setNome("Aeromodelismo");
		Curso curso2 = new Curso();
		curso2.setNome("Paraquedismo");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jota");
		aluno1.setCpf(12232599);
		
		System.out.println(aluno1);
		
		

	}

}
