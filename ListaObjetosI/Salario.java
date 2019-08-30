package ListaObjetos;

public class Salario {

	private float valorHora = 0;
	private int quantiHoras = 0;
	
	public Salario() {
		
	}
	
	public void salarioLiquido() {
		float salarioBruto = valorHora * quantiHoras;
		float inss = salarioBruto * (float) 0.08;
		float sindicato = salarioBruto * (float) 0.05;
		float ir = salarioBruto * (float) 0.11;
		float sal = salarioBruto - (inss + sindicato + ir);
		System.out.println(
				"Salario Bruto: R$ " + salarioBruto + " \nDescontos: \n- INSS: R$ " + inss + " \n- Sindicato: R$"
						+ " " + sindicato + " \n- Imposto de Renda: R$ " + ir + " \n= Salário Líquido: R$ " + sal);

}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		if(valorHora > 0)
		this.valorHora = valorHora;
	}

	public int getQuantiHoras() {
		return quantiHoras;
	}

	public void setQuantiHoras(int quantiHoras) {
		if(quantiHoras > 0)
		this.quantiHoras = quantiHoras;
	}
	
	
	
}

