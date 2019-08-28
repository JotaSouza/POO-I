package ListaObjetosI;

public class Pessoa {

	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public Pessoa(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0)
			this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso > 0)
			this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public void envelhecer() {
		idade = idade + 1;
		if (idade <= 21)
			crescer();
	}

	public void engordar() {
		peso = peso + 1;
	}

	public void emagrecer() {
		peso = peso - 1;
	}

	private void crescer() {
			altura = altura + (float) 0.05;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome=");
		builder.append(nome);
		builder.append(", Idade=");
		builder.append(idade);
		builder.append(", Peso=");
		builder.append(peso);
		builder.append(", Altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
}
