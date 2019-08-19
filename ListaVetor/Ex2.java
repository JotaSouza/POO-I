package ListaVetor;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i = 0; i < vetor.length; i++){
			System.out.print("Informe o "+(i+1)+"º número: ");
			vetor[i] = entrada.nextInt();
		}
		
		for(int i = vetor.length-1 ; i >= 0; i--){
			System.out.print(vetor[i]+" | ");
		}
		entrada.close();

	}

}
