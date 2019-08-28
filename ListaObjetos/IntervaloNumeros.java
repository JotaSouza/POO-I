package ListaObjetos;

public class IntervaloNumeros {
	private int num1 = 0, num2 = 0;
	
	public IntervaloNumeros() {
		
	}
	
	public void recebeNumeros(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("\nPrimeiro n�mero informado � maior que o segundo!"
					+ "\nFazendo a invers�o");
			int aux = num2;
			num2 = num1;
			num1 = aux;
		}
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public void mostraIntervalo() {
		recebeNumeros(getNum1(), getNum2());
		System.out.println("\nOs n�meros que constam no intervalo entre os n�meros informados s�o: ");
		for(int i = num1 + 1; i < num2; i++) {
			System.out.print(i+" | ");
		}
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	

}
