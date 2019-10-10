package Enumeradores.Atividades;

public class Gerente extends Funcionario {

	@Override
	public double salarioLiquido(double valor, double desconto) {
		double salario = (valor - desconto) * 1.01;
		return salario;
	}

}
