package Generalizacao.Exercicios.Item;

public class MainItem {

	public static void main(String[] args) {
		
		Item item1 = new Item();
		
		item1.setCodigo(001);
		item1.setDescricao("CD AO Vivo - Jo�o Gabriel");
		System.out.println(item1.toString());
		
		CD cd = new CD();
		
		cd.setAlbum("Jo�o Gabriel - Ao Vivo");
		cd.setArtista("Jo�o Gabriel");
		cd.setCodigo(1);
		cd.setDescricao("Jo�o Gabriel lan�a seu primeiro CD ao vivo gravado em Lontras");
		cd.setDuracao(90);
		cd.setFaixas(16);
		cd.setGravadora("Live Action");
		System.out.println(cd.toString());

	}

}
