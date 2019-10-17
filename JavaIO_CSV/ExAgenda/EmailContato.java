package JavaIO_CSV.ExAgenda;

import java.util.Calendar;

public class EmailContato extends Contato {

	private String email;
	
	public EmailContato(String nome, Calendar dataNascimento, String email) {
		super(nome);
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() + "email: "+ email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
