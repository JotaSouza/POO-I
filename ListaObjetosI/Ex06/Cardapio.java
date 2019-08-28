package ListaObjetosI.Ex06;

public class Cardapio {

	private int codigo, quant;
	
	public Cardapio(){
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo >= 100 && codigo <= 105)
			this.codigo = codigo;
	}

	public float getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		if (quant > 0)
			this.quant = quant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cardapio [codigo=");
		builder.append(codigo);
		builder.append(", qtd=");
		builder.append(quant);
		builder.append("]");
		return builder.toString();
	}
}
