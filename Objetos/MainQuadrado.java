package Objetos;


public class MainQuadrado {

	public static void main(String[] args) {
		
		Quadrado quad = new Quadrado();
		
		quad.setLado(6);
		quad.setCor("Amarelo");
		System.out.println(quad.getLado());
		System.out.println(quad.area());
		System.out.println(quad.getCor());

	}

}
