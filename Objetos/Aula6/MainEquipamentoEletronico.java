package Aula6;

public class MainEquipamentoEletronico {

	public static void main(String[] args) {
		
		EquipamentoEletronico e1 = new EquipamentoEletronico();
		
		e1.setTensao(220);
		e1.setConsumo(1500);
		System.out.println(e1);
		
		SistemaDeSom som = new SistemaDeSom();
		
		som.setTensao(220);
		som.setConsumo(1500);
		som.setMarca("Sony");
		som.setModelo("a129");
		som.setPotencia(120);
		System.out.println(som);
		
		SistemaDeVideo video = new SistemaDeVideo();
		
		video.setTensao(220);
		video.setConsumo(1500);
		video.setMarca("Aiwa");
		video.setModelo("a129");
		video.setResolucao("800 x 600");
		video.setTipo("CRT");
		System.out.println(video);
		
		HomeTheater ht = new HomeTheater();
		
		//ht.setSom(som);
		//ht.setVideo(video);
		ht.som.setTensao(200);
		ht.video.setResolucao("2000");
		System.out.println(ht);
		

	}

}
