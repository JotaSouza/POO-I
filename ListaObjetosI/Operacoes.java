package ListaObjetosI;

public class Operacoes {
	private int num1 = 0, num2 = 0;
	
	public Operacoes() {
		
	}
	
	public void operacoesNumeros() {
		System.out.println("Adição de "+num1+" com "+num2+" é :"+(num1+num2));
		System.out.println("A subtração de "+num1+" e "+num2+" é :"+(num1-num2));
		System.out.println("A multiplicação de "+num1+" por "+num2+" é :"+(num1*num2));
		System.out.println("A divisão de "+num1+" por "+num2+" é :"+(num1/num2));
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
