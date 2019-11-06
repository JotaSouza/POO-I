package PAePG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public interface GravacaoPaPg {
	
	public boolean gravarArquivo(double[] list) throws IOException;
	public double[] lerArquivo() throws ParseException, FileNotFoundException;

}
