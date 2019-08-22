package Objetos;

import java.util.Scanner;

public class MainPiramide {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Piramide piramide = new Piramide();
		
		System.out.print("Informe o valor de ab:");
		piramide.setAB(entrada.nextDouble());
		System.out.print("Informe o valor de h: ");
		piramide.setH(entrada.nextDouble());
		System.out.print("Informe o tipo de tinta: ");
		piramide.setTipoTinta(entrada.nextInt());
		
		entrada.close();
		
		System.out.println("");
		System.out.println(piramide);
		
		
		

	}

}
