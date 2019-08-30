package ListaObjetos;

import java.util.Scanner;

public class TestaSalarioNew {

	public static void main(String[] args) {
		SalarioNew val = new SalarioNew();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora trabalhada: ");
		val.setValorPHora(entrada.nextFloat());;
		System.out.print("Informe quantas horas você trabalha por mês: ");
		val.setQtdHoras(entrada.nextInt());
		
		val.salarioLiquido();
		
		entrada.close();

	}

}
