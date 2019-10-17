package JavaIO_CSV;

import java.util.Date;

public class Pessoa {

	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	private Date dataNascimento;
	
	//construtor do objeto pessoa	
	public Pessoa(int codigo, String nome, String telefone, String email, Date dataNascimento) {
		if(codigo < 0) {
			throw new IllegalArgumentException("Código não pode ser menor que 0!");
		}
		if(nome.length() < 0) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;		
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo < 0) {
			throw new IllegalArgumentException("Código não pode ser menor que 0!");
		}
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() < 0) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
		this.nome = nome;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}
	
}
