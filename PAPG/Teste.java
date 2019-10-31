package PAPG;

import com.google.gson.Gson;

public class Teste {

	public static void main(String[] args) {
		Progressao p = new Progressao();
		Gson gson = new Gson();
		
		p.setA1(1);
		p.setRazao(3);
		p.setQuantDeElementos(4);
		p.setTipo(TipoProgressao.PA);

		String aux = gson.toJson(p);
		
		System.out.println(aux);
		p.calculaPa();
		

	}

}
