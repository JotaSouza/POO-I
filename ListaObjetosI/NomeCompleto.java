package ListaObjetos;

public class NomeCompleto {
	private String nome;
	private String sobrenome;

	public NomeCompleto() {
		
	}
	
	public void nomeCompleto(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void mostraNome() {
		System.out.println("Seu nome completo é: "+nome+" "+sobrenome+".");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
