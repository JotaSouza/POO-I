package ListaObjetosI;

public class TestaQuadrado {

	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		
		q.setTamanhoDoLado(100);
		System.out.println(q.valorLado());
		q.mudarTamanhoDoLado(150);
		System.out.println(q.valorLado());
		System.out.println(q.calcularAreaQuadrado());
	}

}
