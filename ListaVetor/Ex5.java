package ListaVetor;

public class Ex5 {

	public static void main(String[] args) {
		
		char[] vet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'u'};
		int count = 0;
		
		System.out.println("Consoantes do vetor:");
		for(int i = 0; i < vet.length; i++){
			if((vet[i] != 'a') &&(vet[i] != 'e') && (vet[i] != 'i') && (vet[i] != 'o') && (vet[i] != 'u')){
				count = count + 1;
				System.out.print(vet[i]+" | ");
			}
		}
		System.out.println("\nQuantidade de consoantes lidas: "+count);
		
		

	}

}
