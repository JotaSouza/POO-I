package Enumeradores.Atividades;

public class TesteFuncionario {

	public static void main(String[] args) {
		//FolhaPagamento folha = new FolhaPagamento();
		TipoFuncionario tipo = TipoFuncionario.ANALISTA;
		
		switch (tipo) {
		case ANALISTA:
			
			break;

		default:
			System.out.println("Erro");
			break;
		}

		System.out.println(tipo.getTipo());
	}

}
