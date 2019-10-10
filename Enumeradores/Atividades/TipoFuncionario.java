package Enumeradores.Atividades;

public enum TipoFuncionario {

	ESTAGIARIO(1), DESENVOLVEDOR(2), ANALISTA(3), GERENTE(4);
	
	private final int tipo;
	
	private TipoFuncionario(int valorTipo) {
		tipo = valorTipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	
}
