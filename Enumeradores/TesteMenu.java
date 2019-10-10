package Enumeradores;

public class TesteMenu {

	public static void main(String[] args) {
		OpcoesMenu tipo = OpcoesMenu.ABRIR;
		
		switch (tipo) {
		case ABRIR:
			System.out.println("abrir");
			break;
		default:
			System.out.println("Erro");
			break;
		}
		
		System.out.println(tipo.getValor());

	}

}
