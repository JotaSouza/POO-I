package ListaVetor;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 

		String texto= " ";
		
		System.out.println("Digite um pequeno texto: ");
		texto = entrada.nextLine();
		
		char caracter[] = texto.toCharArray();
		
		System.out.println("Mostrando o texto separado por caracter:");
		for (int i = 0; i < caracter.length; i++) {
			System.out.print(caracter[i]+" | ");
	
		}
		entrada.close();

	}

}
