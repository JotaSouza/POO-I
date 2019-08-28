package ListaObjetosI;

public class Conta {

	private int numeroConta = 0;
	private String nome = " ";
	private double saldo = 0;
	
	public Conta(int numeroConta, String nome, double saldo) {
		setNome(nome);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void incluirConta(int codContasExistentes[], int totalContasExistentes) {
		totalContasExistentes++;
		codContasExistentes[totalContasExistentes] = numeroConta;
		
		System.out.println(totalContasExistentes);
		System.out.println(codContasExistentes[totalContasExistentes]);
	}
	
	public void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
	public boolean validarDeposito(double valorDeposito) {
		if(valorDeposito > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void deposito(double valorDeposito) {
		if(validarDeposito(valorDeposito) == true) {
			saldo = saldo + valorDeposito;
		}
	}
	
	public boolean validarSaque(double valorSaque) {
		if(saldo >= valorSaque)
			return true;
		else {
			return false;
		}
	}
	
	public void saque(double valorSaque) {
		if(validarSaque(valorSaque) == true)
			saldo = saldo - valorSaque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sis Banco [Numero da Conta = ");
		builder.append(numeroConta);
		builder.append(", Nome Cliente = ");
		builder.append(nome);
		builder.append(", Saldo = ");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}	
}
