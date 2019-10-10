package Enumeradores.Atividades;

public class Estagiario extends Funcionario {

	@Override
	public double salarioLiquido(double valor, double desconto) {
		double salario = (valor - desconto) * 1.2;
		return salario;
	}

}
