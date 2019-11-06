package PAePG;

import java.io.IOException;

public class TestaPAPG {

	public static void main(String[] args) throws IOException{
		
		OperacoesProgressao progressao = new OperacoesProgressao();
		Json json = new Json();
		PersistenciaPaPg persistencia = new PersistenciaPaPg(json);
		
		progressao.setA1(2);
		progressao.setQuantidade(6);
		progressao.setRazao(7);
		progressao.setTipo(TipoProgressao.PA);
		json.setNomeJson("jota.json");
		
		final int TAM = progressao.getQuantidade();
		double[] array = new double[TAM];
		array = progressao.PG();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		persistencia.gravarArquivo(array);
	    //json.gravarArquivo(array);
		
	}

}
