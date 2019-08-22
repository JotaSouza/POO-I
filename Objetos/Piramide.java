package Objetos;

public class Piramide {

	private double ab, h;
	private int tipoTinta;
	
	public double getAB() {
		return ab;
	}
	
	public void setAB(double ab) {
		this.ab = ab;
	}
	
	public double getH() {
		return h;
	}
	
	public void setH(double h) {
		this.h = h;
	}
	
	public int getTipoTinta() {
		return tipoTinta;
	}
	
	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	
	public double A1() {
		return Math.sqrt( (h*h) + (ab * ab));
	}
	
	public double areaTriangulo() {
		return (ab+ab)*A1()/2;
	}
	
	public double areaQuadrado() {
		return (ab+ab) * (ab+ab);
	}
	
	public double areaTotal() {
		return (areaTriangulo()*4) + areaQuadrado();
	}
	
	public double volume() {
		return (areaQuadrado()/3) * A1();
	}
	
	public double litrosTinta() {
		return areaTotal()/4.76;
	}
	
	public double latasTinta() {
		return Math.ceil(litrosTinta()/18);
	}
	
	public double valorTinta() {
		double preco = 0;
		if(tipoTinta == 1) {
			preco = latasTinta()*127.90;
		} else if(tipoTinta == 2) {
			preco = latasTinta() *258.98;
		} else {
			preco = latasTinta()* 344.34;
		}
		return preco;
	}
	
}
