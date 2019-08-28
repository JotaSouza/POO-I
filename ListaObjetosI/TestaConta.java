package ListaObjetosI;

public class TestaConta {

	public static void main(String[] args) {
		
		int numeroConta = 100775;
		String nome = "Jota";
		double saldo = 2500;
		
		Conta conta = new Conta(numeroConta, nome, saldo);
		
		System.out.println(conta.toString());
		
		int totalContasExistentes = 100;
		int codigoContasExistentes[] = new int[500];
		conta.incluirConta(codigoContasExistentes, totalContasExistentes);
		conta.alterarNome("Jônatas");
		
		double valorDeposito = 200;
		System.out.println(conta.validarDeposito(valorDeposito));
		conta.deposito(valorDeposito);
		
		double valorSaque = 500;
		System.out.println(conta.validarSaque(valorSaque));
		conta.saque(valorSaque);
		
		System.out.println(conta.toString());
		

	}

}
