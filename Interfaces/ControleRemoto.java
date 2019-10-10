package Interfaces;

public class ControleRemoto extends EquipamentoEletronico implements IControle {

	private TV tv;
	private int cargaPilha;

	public int getCargaPilha() {
		return cargaPilha;
	}

	public void setCargaPilha(int cargaPilha) {
		this.cargaPilha = cargaPilha;
	}

	@Override
	public boolean ligaDesliga() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int alterarCanal(int canal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int canalMais() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int canalMenos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeMais() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeMenos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
