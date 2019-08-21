package ListaMatriz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[][] vetor = new float [5][5];
		float[] somaPorSuper = new float[5];
		float maior = 0;
		float menor = 0;
		System.out.println("                 ::.. SysPag Pouco ..::"
				+ "\n======================================================");
		System.out.println("-> Informe o preço de 5 produtos de 5 supermercados <-"
				+ "\n======================================================");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(" ");
			for(int j = 0; j < 5; j++) {
				System.out.print("Informe o valor do "+(j+1)+"º prodruto do "+(i+1)+"º supermercado: ");
				vetor[i][j] = entrada.nextFloat();
				somaPorSuper[i] = somaPorSuper[i] + vetor[i][j];
				 
				if((j == 0)&&(i == 0)){
						maior = somaPorSuper[i];
						menor= somaPorSuper[i];
					}
					else{
						if (maior < somaPorSuper[i])
							maior = somaPorSuper[i];
						if (menor > somaPorSuper[i])
							menor = somaPorSuper[i];
					}			
			}
		}
		System.out.println("::.. Resultados ..::");
		System.out.println("\nPreço dos produtos");
		//Preços em cada Supermercado
		for(int i = 0; i < 5; i++) {
			System.out.println(" ");
			for(int j = 0; j < 5; j++) {
				System.out.print("O preço do "+(j+1)+"º prodruto no "+(i+1)+"º supermercado é: "+vetor[i][j]+"\n");
			}
		}
		System.out.println("\nPreços por supermercado");				
		//Soma dos preços por Supermercado		
		System.out.println(" ");
		for(int i = 0; i <= 5; i++) {
			System.out.println("Soma dos preços no "+(i+1)+"º supermercado: "+somaPorSuper[i]);
		}
		
		System.out.println("\nComparação");
		System.out.println("\nO valor total dos produtos no supermercado mais barato é de: "+menor);
		System.out.println("\nO valor total dos produtos no supermercado mais caro é de: "+maior);
		
		
		entrada.close();

	}

}
