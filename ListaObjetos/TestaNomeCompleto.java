package ListaObjetos;

import java.util.Scanner;

public class TestaNomeCompleto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		NomeCompleto nome = new NomeCompleto();
		
		System.out.print("Informe seu primeiro nome: ");
		nome.setNome(entrada.nextLine());
		System.out.print("Informe seu sobrenome: ");
		nome.setSobrenome(entrada.nextLine());
		
		nome.mostraNome();
		
		entrada.close();

	}

}
