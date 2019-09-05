package Generalizacao.Exercicios.Item;

public class MainItem {

	public static void main(String[] args) {
		
		Item item1 = new Item();
		
		item1.setCodigo(001);
		item1.setDescricao("CD AO Vivo - João Gabriel");
		System.out.println(item1.toString());
		
		CD cd = new CD();
		
		cd.setAlbum("João Gabriel - Ao Vivo");
		cd.setArtista("João Gabriel");
		cd.setCodigo(1);
		cd.setDescricao("João Gabriel lança seu primeiro CD ao vivo gravado em Lontras");
		cd.setDuracao(90);
		cd.setFaixas(16);
		cd.setGravadora("Live Action");
		System.out.println(cd.toString());

	}

}
