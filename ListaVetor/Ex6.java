package ListaVetor;

public class Ex6 {

	public static void main(String[] args) {
		
		int[] vet = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] vetP = new int[20];
		int[] vetI = new int[20];
		
		for(int i = 0; i < vet.length; i++){
			vet[i] = vet[i];
			if(vet[i] % 2 == 0){
				   vetP[i] = vet[i];
		  } else {
			  vetI[i] = vet[i];
		  }	
		}
		
		System.out.println("Vetor de números lidos: ");
		for(int i = 0; i < vet.length; i++){
			System.out.print(vet[i]+" | ");
		}
		System.out.println("\nVetor de números pares: ");
		for(int i = 0; i < vetP.length; i++){
			System.out.print(vetP[i]+" | ");
		}
		System.out.println("\nVetor de números impares: ");
		for(int i = 0; i < vetI.length; i++){
			System.out.print(vetI[i]+" | ");
		}

	}

}
