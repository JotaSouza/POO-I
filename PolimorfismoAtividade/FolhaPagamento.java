package PolimorfismoAtividade;

public class FolhaPagamento {

	private double valor;
	private double desconto;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double salarioLiquido() {
		double salarioLiquido = 0.00;
		salarioLiquido = valor - desconto;
		return salarioLiquido;
	}
	
	public double calcularSalario(int tipo) {
		double adicional = 0.00;
		double salarioFinal = 0.00;
		if(tipo == 1) {
			adicional = ((salarioLiquido() * 20)/100);
			salarioFinal = adicional + salarioLiquido();
		} else if(tipo == 2) {
			adicional = ((salarioLiquido() * 10)/100);
			salarioFinal = adicional + salarioLiquido();
		} else if(tipo == 3) {
			adicional = ((salarioLiquido() * 5)/100);
			salarioFinal = adicional + salarioLiquido();
		} else {
			adicional = ((salarioLiquido() * 1)/100);
			salarioFinal = adicional + salarioLiquido();
		}
		return salarioFinal;	
	}
	
	
}
