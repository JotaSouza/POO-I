package AgregacaoComposicao.Exercicios.ContaAvancada;

public class CartaoDeCredito {

	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCartao;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero > 0)
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		if(operadora.length() > 0 )
		this.operadora = operadora;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if (limite >= 0)
		this.limite = limite;
	}
	public String getTipoDeCartao() {
		return tipoDeCartao;
	}
	public void setTipoDeCartao(String tipoDeCartao) {
		if(tipoDeCartao.length() > 0)
		this.tipoDeCartao = tipoDeCartao;
	}
	
	
}
