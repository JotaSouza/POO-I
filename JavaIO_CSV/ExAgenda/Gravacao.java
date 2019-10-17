package JavaIO_CSV.ExAgenda;

import java.util.List;

public interface Gravacao {

	public boolean gravar(List<Pessoa> list);
	public List<Pessoa> ler();
}
