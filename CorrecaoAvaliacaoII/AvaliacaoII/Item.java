package AvaliacaoII;

public class Item {

	private double valor;
	private String rastreio;
	private Cidade origem;
	private Cidade destino;
	
	public Item(double valor, String rastreio, Cidade origem, Cidade destino) {
		this.valor = valor;
		this.rastreio = rastreio;
		this.origem = origem;
		this.destino = destino;
	}
	
	public Cidade getOrigem() {
		return origem;
	}

	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}

	public Cidade getDestino() {
		return destino;
	}

	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getRastreio() {
		return rastreio;
	}
	public void setRastreio(String rastreio) {
		this.rastreio = rastreio;
	}
	
	
}
