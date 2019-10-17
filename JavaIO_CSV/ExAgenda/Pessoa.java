package JavaIO_CSV.ExAgenda;

import java.util.Calendar;

public class Pessoa extends Contato {

	private Calendar dataNascimento;
	
	public Pessoa(String nome, Calendar dataNascimento) {
		super(nome);
		this.dataNascimento = dataNascimento;
	}
	
	public String getInfo() {
		
		return super.getInfo() + "Data de nascimento: " + dataNascimento.get(Calendar.DATE) + "/" + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR);
		
	}
	
}
