package Objetos;

public class Quadrado {
	private int lado;
	private String cor;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		if(lado > 0)
     		this.lado = lado;

	}
	
	public float area() {
		return lado * lado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if(cor.length() > 2)
		this.cor = cor;
	}
	
	

}
