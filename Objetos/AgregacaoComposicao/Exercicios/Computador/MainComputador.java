package AgregacaoComposicao.Exercicios.Computador;

public class MainComputador {

	public static void main(String[] args) {
		
		EquipamentoEletronico e = new EquipamentoEletronico();
		e.setTensao(220);
		e.setConsumo(1350);
		System.out.println(e);
		
		HD hd = new HD();
		hd.setCapacidade(500);
		hd.setMarca("Gigabit");
		hd.setModelo("SSD");
		hd.setRpm(7200);
		System.out.println(hd);
		
		Memoria me = new Memoria();
		me.setCapacidade(16);
		me.setMarca("Kingston");
		me.setModelo("DDR4");
		me.setVelocidade(2400);
		System.out.println(me);
		
		Processador p = new Processador();
		p.setCache(3600);
		p.setClock(7600);
		p.setMarca("AMD");
		p.setModelo("Rizen");
		System.out.println(p);
		
		PlacaMae pla = new PlacaMae();
		pla.setHd(hd);
		pla.setMarca("Intel");
		pla.setModelo("AOSH9078");
		pla.setMemoria(me);
		pla.setProcessador(p);
		System.out.println(pla);
		
		Gabinete g = new Gabinete();
		g.setModelo("Gamer");
		g.setTipo("ATX");
		g.setBaias(4);
		g.setPlacamae(pla);
		System.out.println(g);
		
		Monitor mo = new Monitor();
		mo.setMarca("Samsung");
		mo.setResolucao("1800 x 1054");
		mo.setTipo("Widescreen");
		
		Teclado t = new Teclado();
		t.setMarca("Multilaser");
		t.setTipo("ABNT2");
		System.out.println(t);
		
		Mouse mou = new Mouse();
		mou.setMarca("Microsoft");
		mou.setTipo("Optico");
		System.out.println(mou);
		
		Computador c = new Computador();
		c.setConsumo(2400);
		c.setTensao(220);
		c.setMarca("Positivo");
		c.setModelo("Desktop");
		c.setMonitor(mo);
		c.setTeclado(t);
		c.setGabinete(g);
		c.setMouse(mou);
		System.out.println(c);
		
		
		

	}

}
