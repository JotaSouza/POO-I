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
		return false;
	}
	public boolean sequePoupança(double valor){
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
