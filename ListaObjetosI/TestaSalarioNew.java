package ListaObjetos;

import java.util.Scanner;

public class TestaSalarioNew {

	public static void main(String[] args) {
		SalarioNew val = new SalarioNew();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto voc� ganha por hora trabalhada: ");
		val.setValorPHora(entrada.nextFloat());;
		System.out.print("Informe quantas horas voc� trabalha por m�s: ");
		val.setQtdHoras(entrada.nextInt());
		
		val.salarioLiquido();
		
		entrada.close();

	}

}
