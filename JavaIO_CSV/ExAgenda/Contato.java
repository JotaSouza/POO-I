package JavaIO_CSV.ExAgenda;

import java.util.ArrayList;

abstract public class Contato {

	protected String nome;
	protected ArrayList<Telefone>telefones;
	
	public Contato() {
		nome = " ";
		telefones = new ArrayList<>();
	}
	
	public Contato(String nome) {
		 this.nome = nome;
	     telefones = new ArrayList();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 0)
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		this.nome = nome;
	}

	public void setTelefone(Telefone tel) {
		telefones.add(tel);
	}
	
	public String getInfo() {
		String n = nome + "\n";
		for (Telefone t : telefones) {
			n+= t.getNumero() + "\n";
		}
		return n;
	}
	
}
