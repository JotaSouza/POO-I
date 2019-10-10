package Enumeradores.Atividades;

public class Analista extends Funcionario {

	@Override
	public double salarioLiquido(double valor, double desconto) {
		double salario = (valor - desconto) * 1.05;
		return salario;
	}

}
