package ListaObjetos;

public class OperacoesMatematicas {
	private int num1 = 0, num2 = 0;

	public OperacoesMatematicas() {
		
	}
	
	public void numeros(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void operacoesMatematicas() {
		numeros(getNum1(), getNum2());
		System.out.println("A soma dos números informados é igual a: "+(num1 + num2));
		System.out.println("A subtração dos números informados é igual a: "+(num1 - num2));
		System.out.println("A multiplicação dos números informados é igual a: "+(num1 * num2));
		System.out.println("A divisão dos números informados é igual a: "+(num1 / num2));
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
