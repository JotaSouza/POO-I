package Enumeradores.Atividades;

public class FolhaPagamento {

	private Funcionario func;
	private double valor;
	private double desconto;
	
	public FolhaPagamento(Funcionario func, double valor, double desconto) {
		this.func = func;
		this.valor = valor;
		this.desconto = desconto;
	}

	public Funcionario getFunc() {
		return func;
	}

	public void setFunc(Funcionario func) {
		this.func = func;
	}

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
		double sal = func.salarioLiquido(valor, desconto);
		return sal;
	}
}
