package AgregacaoComposicao.Exercicios.HomeTheater;

public class MainEquipamento {

	public static void main(String[] args) {
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(220);
		ee.setTensao(120);
		System.out.println(ee);
		
		SistemaDeSom som = new SistemaDeSom();
		som.setConsumo(1500);
		som.setMarca("Sony");
		som.setModelo("A0B129");
		som.setPotencia(2000);
		som.setTensao(220);
		System.out.println(som);
		
		SistemaDeVideo video = new SistemaDeVideo();
		video.setMarca("Samsung");
		video.setModelo("BC053");
		video.setTipo("LCD");
		video.setConsumo(1000);
		video.setResolucao("1680 x 1050");
		video.setTensao(220);
		System.out.println(video);
		
		HomeTheater ht = new HomeTheater();
		ht.som.setPotencia(3600);
		ht.video.setResolucao("800 x 600");
		System.out.println(ht);

	}

}
