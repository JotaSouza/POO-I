package Enumeradores.Atividades;

public class Desenvolvedor extends Funcionario {

	@Override
	public double salarioLiquido(double valor, double desconto) {
		double salario = (valor - desconto) * 1.1;
		return salario;
	}

}
