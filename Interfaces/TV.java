package Interfaces;

public class TV extends EquipamentoEletronico  implements IControle{

	private String marca;
	private String modelo;
	private boolean estado;
	private int volume;
	private int canal;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
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
