package JavaIO_CSV.ExAgenda;

import java.util.ArrayList;

public class OperacoesAgenda {

	private ArrayList<Contato> contatos;
	
	//construtor da agenda de contatos
	public OperacoesAgenda(){
		contatos = new ArrayList<>();
	}
	
	//metodo que insere o contato na lista
	public void inserirContato(Contato contato) {
		contatos.add(contato);
	}
	
	//metodo que faz a consulta do contato na lista
	public Contato ContatoConsultar(String nome) {
		for(int i = 0; i < contatos.size(); i++) {
			Contato cont = contatos.get(i);
			if(cont.getNome().equalsIgnoreCase(nome))
				return contatos.get(i);
		}
		return null;
	}
	
	//metodo que faz a consulta por email do contato na lista
	public Object EmailContatoconsultarEmail(String email) {
		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i) instanceof EmailContato) {
				EmailContato mail = (EmailContato)contatos.get(i);
				if(mail.getEmail().equalsIgnoreCase(email)) {
					return (EmailContato)contatos.get(i);
				}
			}
		}
		return null;
		
	}
	
}
