package Enumeradores;

public class TesteEnum {

	public static void main(String[] args) {
		TipoUsuario tipo = TipoUsuario.CONTROLER;
		System.out.println(tipo.name());
		System.out.println(tipo.toString());
		System.out.println(tipo.ordinal());
		System.out.println("\nTipos de usuários");
		for (TipoUsuario item : TipoUsuario.values()) {
			System.out.println(item.name());
		}
	}

}
