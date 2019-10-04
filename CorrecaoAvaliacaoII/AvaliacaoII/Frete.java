package AvaliacaoII;

import java.util.ArrayList;
import java.util.List;

public class Frete {

	private Motorista motorista;
	private Cidade cidade;
	private List<Item> itens = new ArrayList<Item>();
	
	public Frete(Motorista motorista, Cidade cidade, List<Item> itens) {
		this.motorista = motorista;
		this.cidade = cidade;
		this.itens = itens;
	}
	
	public double valorTotalFrete() {
		double valorItens = 0;
		for (Item item : itens) {
			valorItens+= item.getValor();
		}
		return valorItens;	
	}
	
	public String cidades() {
		List<Cidade> cidade = new ArrayList<>();
		for (Item item : itens) {
			boolean repeat = false;
			for (Cidade cid : cidade) {
				if(cid.getNome().equalsIgnoreCase(item.getOrigem().getNome())) {
					repeat = true;
					break;
				}
			}
			
			if(!repeat) {
				cidade.add(item.getOrigem());
			}
			repeat = false;
			
			for (Cidade cida : cidade) {
				if(cida.getNome().equalsIgnoreCase(item.getDestino().getNome())) {
					repeat = true;
					break;
				}
			}
			if(!repeat) {
				cidade.add(item.getDestino());
			}
		}
		String retorno = " ";
		for (Cidade cidad : cidade) {
			retorno+= cidad.getNome() + "\n";
		}
		return retorno;
		
	}
	
	public Item maiorValor() {
		Item maiorValorItem = null;
		for (Item item : itens) {
			if(maiorValorItem == null || item.getValor() > maiorValorItem.getValor()) {
				maiorValorItem = item;
			}
		}
		return maiorValorItem;
	}
	
	public String nomeMotorista() {
		return motorista.getNome();
	}
	
	public String cidadeItens() {
		List<Cidade> cidOrigem = new ArrayList<>();
		List<Cidade> cidDestino = new ArrayList<>();
		String retorno = "";
		for (Item item : itens) {
			cidOrigem.add(item.getOrigem());
			cidDestino.add(item.getDestino());
		}
		
		int nrItensCidade = 0;
		retorno+= "Origem\n";
		for (int i = cidOrigem.size() - 1; i >= 0; i --)
		{
			String cidadeAtual = cidOrigem.get(i).getNome();
			 nrItensCidade = 1;
			 cidOrigem.remove(i);
			 
			 for(int j = cidDestino.size() -1; j >= 0; j--) {
				 if(cidOrigem.get(j).equals(cidadeAtual)) {
					 nrItensCidade++;
					 cidOrigem.remove(j);
					 i--;
				 }
			 }
			 retorno+= cidOrigem + " (" + nrItensCidade + ")\n";
		}
		
		return retorno;
		
	}
}
