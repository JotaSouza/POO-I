package Deitel;

public class ComissaoEmpregado extends Object {
	private final String nome;
	private final String sobrenome;
	private final String cpf;
	private double valorVendasSemanais;
	private double percentagemComissao;
	
	public ComissaoEmpregado(String nome, String sobrenome, String cpf, double valorVendasSemanais, double percentagemComissao){
		if(valorVendasSemanais < 0.0){
			throw new IllegalArgumentException("Valor de vendas deve ser >= R$ 0.00");
		}
		if(percentagemComissao <= 0.0 || percentagemComissao >= 1.0){
			throw new IllegalArgumentException("Percentagem deve ser > 0.0 e < 1.0");
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.valorVendasSemanais = valorVendasSemanais;
		this.percentagemComissao = percentagemComissao;
	}

	public double getValorVendasSemanais() {
		return valorVendasSemanais;
	}

	public void setValorVendasSemanais(double valorVendasSemanais) {
		if(valorVendasSemanais < 0.0)
			throw new IllegalArgumentException("Valor de vendas deve ser >= R$ 0.00");
		this.valorVendasSemanais = valorVendasSemanais;
	}

	public double getPercentagemComissao() {
		return percentagemComissao;
	}

	public void setPercentagemComissao(double percentagemComissao) {
		if(percentagemComissao <= 0.0 || percentagemComissao >= 1.0)
			throw new IllegalArgumentException("Percentagem deve ser > 0.0 e < 1.0");
		this.percentagemComissao = percentagemComissao;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public double ganhosEmpregado(){
		return percentagemComissao * valorVendasSemanais;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComissaoEmpregado [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", valorVendasSemanais=");
		builder.append(valorVendasSemanais);
		builder.append(", percentagemComissao=");
		builder.append(percentagemComissao);
		builder.append("]");
		return builder.toString();
	}
	
}
