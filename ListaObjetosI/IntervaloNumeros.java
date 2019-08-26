package ListaObjetosI;

public class IntervaloNumeros {

	private int num1 = 0;
	private int num2 = 0;
	private int aux = 0;
	
	public IntervaloNumeros() {
		
	}
	
	public void inverteNumeros() {
		if(num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
			System.out.println("O segundo n�mero informado � menor que o primeiro! \nFazendo invers�o. ");				
		}
		System.out.print("\nN�meros entre o intervalo "+num1+" e "+num2+" \n| ");
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
