package Pedido;

import java.util.Calendar;
import java.util.Date;

public class PrincipalPedido {

	public static void main(String[] args) {
		Calendar calendarioIni = Calendar.getInstance();
		calendarioIni.set(Calendar.DAY_OF_MONTH, 01);
		calendarioIni.set(Calendar.MONTH, 10);
		calendarioIni.set(Calendar.YEAR, 2019);
		Date dataIni = new Date();
		dataIni = calendarioIni.getTime();
		
		Calendar calendarioFim = Calendar.getInstance();
		calendarioFim.set(Calendar.DAY_OF_MONTH, 31);
		calendarioFim.set(Calendar.MONTH, 10);
		calendarioFim.set(Calendar.YEAR, 2019);
		Date dataFim = new Date();
		dataFim = calendarioFim.getTime();
		
		Pedido pedido = new Pedido(dataIni, dataFim);
		Produto prod1 = new Produto(001, "Leite Desnatado", 1.89, 12);
		pedido.addProduto(prod1);
		Produto prod2 = new Produto(002, "Farinha de Trigo 1Kg", 2.87, 1);
		pedido.addProduto(prod2);
		Produto prod3 = new Produto(003, "Sabão em Pó 1Kg", 13.44, 1);
		pedido.addProduto(prod3);
		Produto prod4 = new Produto(004, "Ração para Cães 7Kg", 46.96, 2);
		pedido.addProduto(prod4);
		
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		System.out.println(prod4);
		
		System.out.println("Valor total: " + pedido.totalPedido());
		System.out.println("Gasto médio do pedido: " + pedido.valorMedio());
		System.out.println(pedido.quantidadeMaior(1));
		System.out.println(pedido.buscaProdutoDescricao("fe"));
		System.out.println("Dias: " + pedido.dias());
		System.out.println(pedido.getDataInicio());
		System.out.println(pedido.getDataFim());

	}

}
