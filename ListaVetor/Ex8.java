package ListaVetor;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int TAM = 5;
		int[] vet = new int[TAM];
		int soma = 0;
		int mult = 1;
		
		System.out.println("::.. Opera��es com Vetor ..:: ");
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			vet[i] = entrada.nextInt();
			soma += vet[i];
			mult = mult * vet[i]; 
			
		}
		System.out.println("N�meros digitados:");
		for (int i = 0; i < TAM; i++) {
		System.out.print(vet[i]+" | ");
		
		}
		System.out.println("\nA soma �: "+soma);
		System.out.println("A multiplica��o �: "+mult);
		
		entrada.close();

	}

}
