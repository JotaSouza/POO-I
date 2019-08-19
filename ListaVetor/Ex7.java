package ListaVetor;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int ALU = 10;
		final int NOTA = 4;
		float[][] vet = new float[ALU][NOTA];
		float[] media = new float[ALU];
		int count = 0;
		
		System.out.print("::.. MédiaAcad ..::");
		for(int i = 0; i < ALU ; i++){
			System.out.println(" ");
			for(int j = 0; j < NOTA; j++){
				System.out.print("Informe a "+(j+1)+"º nota do aluno "+(i+1)+": ");
				vet[i][j] = entrada.nextFloat();
				
				if(j == 0){
					media[i] = 0;
				}
				media[i] = media[i] + vet[i][j];
			}	
		}
		
		for(int i = 0; i < media.length; i++){
			media[i] = media[i] / NOTA;
			if(media[i] >= 7)
				count = count + 1;
		}
		System.out.println("\nNº de alunos com média superior ou igual a 7: "+count);
		
		entrada.close();

	}

}
