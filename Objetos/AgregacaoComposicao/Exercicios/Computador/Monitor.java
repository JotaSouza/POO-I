package AgregacaoComposicao.Exercicios.Computador;

public class Monitor {

	private String marca;
	private String tipo;
	private String resolucao;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0)
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length() > 0)
		this.tipo = tipo;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		if(resolucao.length() > 0)
		this.resolucao = resolucao;
	}
	
	
}
