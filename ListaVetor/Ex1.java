package ListaVetor;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[5];
		for(int i = 0; i < vetor.length; i++){
			System.out.print("Informe o "+(i+1)+"º número: ");
			vetor[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]+" | ");
		}
		entrada.close();

	}

}
