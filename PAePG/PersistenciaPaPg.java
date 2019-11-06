package PAePG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class PersistenciaPaPg {

	private GravacaoPaPg gravacao;

	public PersistenciaPaPg(GravacaoPaPg gravacao) {
		this.gravacao = gravacao;
	}
	
	public boolean gravarArquivo(double[] list) throws IOException{
		return gravacao.gravarArquivo(list);
	}
	
	public double[] lerArquivo() throws  ParseException, FileNotFoundException{
		return gravacao.lerArquivo();
	}
	
	
}
