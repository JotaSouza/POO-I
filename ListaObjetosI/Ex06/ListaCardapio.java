package ListaObjetosI.Ex06;

import java.util.ArrayList;

public class ListaCardapio {

	ArrayList<Cardapio> lista = new ArrayList<Cardapio>();
	
	public void inserir(Cardapio cardapio) {
		lista.add(cardapio);
	}

	public void calcular() {
		float valor = 0;
		float somaValor = 0;
		System.out.println("Total a pagar: \nEspecificação   | Código | Preço");
		for(int i = 0; i < lista.size(); i++) {
			valor = 0;
			switch(lista.get(i).getCodigo()) {
			case 100:
				valor = (float)1.20 * lista.get(i).getQuant();
				System.out.println("Cachorro Quente |  100   | R$ "+valor);
				break;
			case 101:
				valor = (float)1.30 * lista.get(i).getQuant();
				System.out.println("Bauru Simples   |  101   | R$ "+valor);
				break;
			case 102:
				valor = (float)1.50 * lista.get(i).getQuant();
				System.out.println("Bauru com ovo   |  102   | R$ "+valor);
				break;
			case 103:
				valor = (float)1.20 * lista.get(i).getQuant();
				System.out.println("Hambúrguer      |  103   | R$ "+valor);
				break;
			case 104:
				valor = (float)1.30 * lista.get(i).getQuant();
				System.out.println("Cheeseburguer   |  104   | R$ "+valor);
				break;
			case 105:
				valor = (float)1.00 * lista.get(i).getQuant();
				System.out.println("Refrigerante    |  105   | R$ "+valor);
				break;
			}
			somaValor = somaValor + valor;
		}
		System.out.println("Total: R$ "+somaValor);
	}
}
