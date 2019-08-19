package ListaVetor;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM;
		int soma = 0, media = 0, maior, menor;
		System.out.print("Informe o tamanho do vetor: ");
		TAM = entrada.nextInt();
		
		int[] vetor = new int[TAM];
		
			for(int i = 0; i < TAM; i++){
				System.out.print("Informe o "+(i+1)+"º numero: ");
				vetor[i] = entrada.nextInt();
				soma = soma+vetor[i];
				media = soma / TAM;
			}
			
			menor = vetor[0];
			maior = vetor[0];
			for(int i = 0; i < TAM; i++){
				if(vetor[i] < menor)
					menor = vetor[i];
				if(vetor[i] > maior)
					maior = vetor[i];
			}
			
		System.out.printf("\n");
		System.out.printf("Soma = %d\n", soma);
		 System.out.printf("Média = %d\n", media);
		 System.out.printf("\n");
			for (int i = 0; i < TAM; i++) {
		    if (vetor[i] == menor)
			 System.out.printf("v[%d] = %2d <--- menor valor\n", i, vetor[i]);
			else if (vetor[i] == maior)
			    System.out.printf("v[%d] = %2d <--- maior valor\n", i, vetor[i]);
		    else System.out.printf("v[%d] = %2d\n", i, vetor[i]);
	    }
		System.out.printf("\n");
		 for(int i = 0; i < TAM; i++) {
			 if(vetor[i] % 2 == 0){
			    	System.out.printf("v[%d] = %2d <--- Par\n", i, vetor[i]);
			    } else {
			    	System.out.printf("v[%d] = %2d <--- Impar\n", i, vetor[i]);
			    }
		 }
		 
		 System.out.printf("\n");
		 for(int i = 0; i < TAM; i++) {
			 if(vetor[i] > media){
			    	System.out.printf("v[%d] = %2d <--- Acima da média\n", i, vetor[i]);
			    } else {
			    	System.out.printf("v[%d] = %2d <--- Abaixo da média\n", i, vetor[i]);
			    }
		 }
		 entrada.close();

 }
}
