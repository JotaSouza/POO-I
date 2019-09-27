package Pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Operacao {

	private int codigo;
	protected Vendedor vendedor;
	protected Cliente cliente;
	private ArrayList<Produto> listaProdutos;
	
	public Pedido() {
		listaProdutos = new ArrayList<>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	//verifica se produto já existe na lista
	public boolean verificaProdutoUnico(Produto produto) {
		for (Produto prod : listaProdutos) {
			if(prod.getDescricao().equalsIgnoreCase(produto.getDescricao()))
				return true;
		}
		return false;
	}
	//verifica se produto já existe, se não adiciona produto na lista
	public boolean addProduto(Produto produto) {
		boolean b = verificaProdutoUnico(produto);
		if (! b)
			listaProdutos.add(produto);		
		return b;
	}
	//retorna o valor total do pedido
	 public double totalPedido() {
		 double valorTotalPedido = 0;
		 for (Produto prod : listaProdutos) {
			valorTotalPedido+= prod.totalItem();
		}
		return valorTotalPedido; 
	 }
	//retorna o valor medio de cada produto
	 public double valorMedio() {
		 double valItem = 0;
		 for (Produto prod : listaProdutos) {
			valItem += prod.getValor();
		}
		return valItem / listaProdutos.size(); 
	 }
	 //verifica se quantidade maior e retorna em uma lista
	 public List<Produto> quantidadeMaior(int quantidade){
		List<Produto> liProduto = new ArrayList<>();
		for (Produto prod : listaProdutos) {
			if(prod.getQuantidade() > quantidade)
				liProduto.add(prod);
		}
		 return liProduto; 
	 }
	 public String nomeVendedor() {
		return vendedor.getNome();
	 }
	 public String emailCliente() {
		 return cliente.getEmail();
	 }
	 //
	 public List<Produto> buscaProdutoDescricao(String descricao){
		 String s = "abc";
		 boolean b = s.startsWith("te");
		return listaProdutos;
		//criar o for para pegar na lista e comparar
		 
	 }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [codigo=");
		builder.append(codigo);
		builder.append(", vendedor=");
		builder.append(vendedor);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", listaProdutos=");
		builder.append(listaProdutos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
