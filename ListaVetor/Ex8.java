package ListaVetor;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int TAM = 5;
		int[] vet = new int[TAM];
		int soma = 0;
		int mult = 1;
		
		System.out.println("::.. Operações com Vetor ..:: ");
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			vet[i] = entrada.nextInt();
			soma += vet[i];
			mult = mult * vet[i]; 
			
		}
		System.out.println("Números digitados:");
		for (int i = 0; i < TAM; i++) {
		System.out.print(vet[i]+" | ");
		
		}
		System.out.println("\nA soma é: "+soma);
		System.out.println("A multiplicação é: "+mult);
		
		entrada.close();

	}

}
