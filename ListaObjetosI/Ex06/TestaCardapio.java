package ListaObjetosI.Ex06;

import java.util.Scanner;

public class TestaCardapio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		ListaCardapio list = new ListaCardapio();

		int codigo = 0, opcao = 0, quant = 0;
		
		System.out.println("Cardápio Lanchonete");
		System.out.println("\n Especificação | Código | Preço"
				+ "\nCachorro Quente   100    R$ 1,20"
				+ "\nBauru Simples	  101    R$ 1,30"
				+ "\nBauru com Ovo     102	 R$ 1,50"
				+ "\nHambúrguer        103	 R$ 1,20"
				+ "\nCheeseburguer	  104    R$ 1,30"
				+ "\nRefrigerante      105	 R$ 1,00");
		System.out.println("Informe o pedido: ");
		do {
			do {
				System.out.print("Código: ");
				codigo = entrada.nextInt();
				if(codigo < 100 || codigo > 105){
					System.out.println("Código do produto inexistente!"
							+ "\nPor favor, insira um cógigo válido");
				}
			} while (codigo < 100 || codigo > 105);
			System.out.print("Quantidade deste produto: ");
			quant = entrada.nextInt();
			cardapio.setCodigo(codigo);
			cardapio.setQuant(quant);
			list.inserir(cardapio);
			cardapio = new Cardapio();
			do {
				System.out.print("Mais algum pedido?"
						+ "\n[1] - Sim | [0] - Não: ");
				opcao = entrada.nextInt();
			} while (opcao != 1 && opcao != 0);
		} while (opcao == 1);
		
		list.calcular();
		entrada.close();

	}

}
