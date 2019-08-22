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
		System.out.println("ab: "+piramide.getAB());
		System.out.println("h: "+piramide.getH());
		System.out.println("a1: "+piramide.A1());
		System.out.println("�rea Tri�ngulo: "+piramide.areaTriangulo());
		System.out.println("�rea Base: "+piramide.areaQuadrado());
		System.out.println("�rea Total: "+piramide.areaTotal());
		System.out.println("Tipo de Tinta: "+piramide.getTipoTinta());
		System.out.println("Litros: "+ piramide.litrosTinta());
		System.out.println("Latas: "+piramide.latasTinta());
		System.out.println("Pre�o: "+piramide.valorTinta());
		System.out.println("Volume: "+piramide.volume());
		
		

	}

}
