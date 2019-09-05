package Aula6;

public class EquipamentoEletronico {
	private int tensao;
	private int consumo;
	
	
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		if(tensao > 0)
		this.tensao = tensao;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
