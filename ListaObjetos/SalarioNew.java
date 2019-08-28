package ListaObjetos;

public class SalarioNew {
	
	private float valorPHora = 0;
	private int qtdHoras = 0;
	
	public SalarioNew() {
		
	}
	
	public float getValorPHora() {
		return valorPHora;
	}

	public void setValorPHora(float valorPHora) {
		if (valorPHora > 0)
			this.valorPHora = valorPHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		if (qtdHoras > 0)
			this.qtdHoras = qtdHoras;
	}
	
	public float descontoInss() {
		float salarioBruto = valorPHora * qtdHoras;
		float inss = salarioBruto * (float) 0.08;
		return inss;
	}
	
	public float descontoSindicato() {
		float salarioBruto = valorPHora * qtdHoras;
		float sindicato = salarioBruto * (float) 0.05;
		return sindicato;
	}
	
	public float descontoImpostoRenda() {
		float salarioBruto = valorPHora * qtdHoras;
		float ir = salarioBruto * (float) 0.11;
		return ir;
	}
	
	public float descontos() {
		float descontos = descontoInss() + descontoSindicato() + descontoImpostoRenda();
		return descontos;
	}

	public void salarioLiquido() {
		float salarioBruto = valorPHora * qtdHoras;
		float sal = salarioBruto - descontos();
		System.out.println(
				"Salario Bruto: R$ " + salarioBruto + " \nDescontos: \n- INSS: R$ " + descontoInss() + " \n- Sindicato: R$"
						+ " " + descontoSindicato() + " \n- Imposto de Renda: R$ " + descontoImpostoRenda() + " \n= Salário Líquido: R$ " + sal);
}

}
