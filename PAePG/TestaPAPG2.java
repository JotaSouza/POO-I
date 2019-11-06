package PAePG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class TestaPAPG2 {

	public static void main(String[] args)throws IOException, FileNotFoundException, ParseException {
		GeraGraficoPaPg gera = new GeraGraficoPaPg();
		OperacoesProgressao progressao = new OperacoesProgressao();
		Json json = new Json();
		//PersistenciaPaPg persistencia = new PersistenciaPaPg(json);
		
		double[] array = new double[10];
		
		String nomeArquivo = "Jonatas.json";
		json.setNomeJson(nomeArquivo);
		array = json.lerArquivo();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Razão: " + progressao.retornaRazaoPg(array));
		System.out.println("Quantidade: " + progressao.retornaQuantidade(array));
		System.out.println("Somatória: " + progressao.somatoria(array));
		System.out.println("Média: " + progressao.media(array));
		System.out.println("Mediana: " + progressao.mediana(array));
		System.out.println(progressao.PaOuPg(array));
		System.out.println("Integridade do arquivo: " + progressao.verificaArquivo(array));
		
		gera.setVetor(array);
		
		try {
			GeraHTML.gerarHtml(gera.getVetor());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
