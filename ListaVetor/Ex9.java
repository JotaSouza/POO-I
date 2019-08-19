package ListaVetor;

import java.util.*;

public class Ex9 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
		
		String[] consoante = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
		String[] vogal = {"a","e","i","o","u",};
		int size = 0;
		
		System.out.print("Digite o tamanho da senha: ");
		size = entrada.nextInt();
		
		List<String> y = Arrays.asList(consoante);
		Collections.shuffle(y);

		List<String> z = Arrays.asList(vogal);
		Collections.shuffle(z);
		
		System.out.print("Senha gerada: ");
		if(size % 2 == 0) {
			for (int i =0; i  < size; i++) {
				if(i % 2 == 0)
					System.out.print(consoante[i]);
				if(i % 2 != 0)
					System.out.print(vogal[i]);
				}
		} else{
			for (int i=0; i < size; i++) {
				if(i == (size-1))
					System.out.print(consoante[i+5]);
				if(i % 2 == 0)
					System.out.print(consoante[i]);
				if(i % 2 != 0)
					System.out.print(vogal[i]);
				
				}
	       }
		entrada.close();
	}

}
