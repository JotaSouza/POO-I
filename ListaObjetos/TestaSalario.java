package ListaObjetos;

import java.util.Scanner;

public class TestaSalario {

	public static void main(String[] args) {
		Salario val = new Salario();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora trabalhada: ");
		val.setValorHora(entrada.nextFloat());
		System.out.print("Informe quantas horas você trabalha por mês: ");
		val.setQuantiHoras(entrada.nextInt());
		
		val.salarioLiquido();
		
		entrada.close();

	}

}
