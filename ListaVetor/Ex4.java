package ListaVetor;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int [4];
		int soma =0, media = 0;
		
		for(int i = 0; i < vet.length; i++){
			System.out.print("Informe a "+(i+1)+"ª nota: ");
			vet[i] = entrada.nextInt();
			soma = soma + vet[i];
			media = soma / vet.length;
		}
		System.out.printf("Soma da notas = %d\n", soma);
		System.out.printf("Média das notas = %d\n", media);

		entrada.close();
	}

}
