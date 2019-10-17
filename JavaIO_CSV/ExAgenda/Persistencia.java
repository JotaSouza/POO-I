package JavaIO_CSV.ExAgenda;

public class Persistencia {

	private Gravacao grava;
	
	public Persistencia(Gravacao grava) {
		this.grava = grava;
	}
	
	public boolean gravar(List<Pessoa> list) {
		return grava.gravar(list);
	}
	
	public List<Pessoa> ler
}
