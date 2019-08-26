package ListaObjetosI;

import java.util.Scanner;

public class TesteIntervaloNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		IntervaloNumeros numeros = new IntervaloNumeros();
		
		System.out.print("Informe um número inteiro: ");
		numeros.setNum1(entrada.nextInt());
		System.out.print("Informe outro número inteiro: ");
		numeros.setNum2(entrada.nextInt());
		
		numeros.inverteNumeros();
		System.out.println(numeros.toString());
		
		entrada.close();
	}

}
