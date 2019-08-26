package ListaObjetosI;

import java.util.Scanner;

public class NomeCompletoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NomeCompleto n = new NomeCompleto();
		
		System.out.print("Informe seu primeiro nome: ");
		n.setNome(entrada.nextLine());
		System.out.print("Informe seu sobrenome: ");
		n.setSobrenome(entrada.nextLine());
		
		System.out.println("Seu nome completo é: "+n.getNome()+" "+n.getSobrenome());
		
		entrada.close();
		
	}

}
