package PolimorfismoAtividade;

public class TesteFolhaPagamento {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Estagiario estagiario = new Estagiario();
		Desenvolvedor desenvolvedor = new Desenvolvedor();
		Analista analista = new Analista();
		Gerente gerente = new Gerente();
		
		Funcionario[] funcionarios = new Funcionario[4];
		
		funcionarios[0] = funcionario;
		funcionarios[1] = estagiario;
		funcionarios[2] = desenvolvedor;
		funcionarios[3] = analista;
		funcionarios[4] = gerente;
		
		estagiario.setValor(1.200);
		estagiario.setDesconto(30.00);
		estagiario.calcularSalario(1);
		
		desenvolvedor.setValor(2.500);
		desenvolvedor.setDesconto(280.00);
		desenvolvedor.calcularSalario(2);
		
		analista.setValor(3.200);
		analista.setDesconto(260.00);
		analista.calcularSalario(3);
		
		gerente.setValor(7.500);
		gerente.setDesconto(940.00);
		gerente.calcularSalario(4);
		
		for(int x = 0; x < 4; x++) {
			System.out.println(funcionarios[x]);
		}

				

	}

}
