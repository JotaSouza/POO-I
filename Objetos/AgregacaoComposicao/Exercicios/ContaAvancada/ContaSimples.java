package AgregacaoComposicao.Exercicios.ContaAvancada;

public class ContaSimples extends ContaBancaria {

	private double saldoPoupança;

	public double getSaldoPoupança() {
		return saldoPoupança;
	}

	public void setSaldoPoupança(double saldoPoupança) {
		this.saldoPoupança = saldoPoupança;
	}
	
	public boolean depositoPoupança(double valor){
		if(valor > 0)
			saldoPoupança = saldoPoupança + valor;
		    return true;
	}
	public boolean sequePoupança(double valor){
		if (saldoPoupança > valor)
		saldoPoupança = saldoPoupança - valor;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupança=");
		builder.append(saldoPoupança);
		builder.append(", banco=");
		builder.append(banco);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
