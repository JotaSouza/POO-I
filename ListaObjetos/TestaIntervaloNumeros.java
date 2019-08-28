package ListaObjetos;

import java.util.Scanner;

public class TestaIntervaloNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		IntervaloNumeros nuns = new IntervaloNumeros();
		
		System.out.print("Informe um número inteiro: ");
		nuns.setNum1(entrada.nextInt());
		System.out.print("Informe outro número inteiro: ");
		nuns.setNum2(entrada.nextInt());
		
		nuns.mostraIntervalo();
		
		entrada.close();

	}

}
