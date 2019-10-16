package Deitel;

import java.util.Calendar;
import java.util.Date;

public class TesteEmpregado {

	public static void main(String[] args) {
		Calendar dNascimento = Calendar.getInstance();
		dNascimento.set(Calendar.DAY_OF_MONTH, 28);
		dNascimento.set(Calendar.MONTH, 7);
		dNascimento.set(Calendar.YEAR, 1984);
		
		Calendar dContratacao = Calendar.getInstance();
		dContratacao.set(Calendar.DAY_OF_MONTH, 15);
		dContratacao.set(Calendar.MONTH, 7);
		dContratacao.set(Calendar.YEAR, 2012);
		
		Date nascimento = dNascimento.getTime();
		Date contratacao = dContratacao.getTime();
		
		Empregado empregado = new Empregado("Jonatas", "Souza", nascimento, contratacao);
		
		System.out.println(empregado);

	}

}
