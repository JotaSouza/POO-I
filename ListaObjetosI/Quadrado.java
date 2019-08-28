package ListaObjetosI;

public class Quadrado {

	private double tamanhoDoLado = 0;
	
	public Quadrado(){
		
	}

	public double getTamanhoDoLado() {
		return tamanhoDoLado;
	}

	public void setTamanhoDoLado(double tamanhoDoLado) {
		this.tamanhoDoLado = tamanhoDoLado;
	}
	
	public void mudarTamanhoDoLado(double novoTamanhoLado) {
		tamanhoDoLado = novoTamanhoLado ;
	}
	
	public double valorLado() {
		return tamanhoDoLado;
	}
	
	public double calcularAreaQuadrado(){
		double area = tamanhoDoLado * tamanhoDoLado;
		return area;
	}
}
