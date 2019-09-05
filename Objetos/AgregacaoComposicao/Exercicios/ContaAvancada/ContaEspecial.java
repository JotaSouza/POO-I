package AgregacaoComposicao.Exercicios.ContaAvancada;

public class ContaEspecial extends ContaBancaria {

	private int diasSemJuros;
	private double limite;
	protected CartaoDeCredito cartao;
	private double saldoContaEspecial;
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		if(diasSemJuros > 0)
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}
	public double getSaldoContaEspecial() {
		return saldoContaEspecial;
	}
	public void setSaldoContaEspecial(double saldoContaEspecial) {
		this.saldoContaEspecial = saldoContaEspecial;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", saldoContaEspecial=");
		builder.append(saldoContaEspecial);
		builder.append(", banco=");
		builder.append(banco);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
}
