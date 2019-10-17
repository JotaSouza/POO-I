package JavaIO_CSV.ExAgenda;

public class Telefone {

	private String numero;
	
	public Telefone(String numero) {
		if(numero.length() < 0)
			throw new IllegalArgumentException("N�mero n�o pode ser negativo!");
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
	
}
