package ListaMatriz;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		int TAM = 0, maior = 0, menor = 0, soma = 0, count = 0, countPares = 0, countImpares = 0, somaDiagoPrin = 0, somaDiagoSec= 0;
		float media = 0;
		
		System.out.println("::.. Operações com Matriz ..::");
		
		do{
		System.out.print("Informe um número inteiro ímpar entre 3 e 11(inclusive 3 e 11): ");
		TAM = entrada.nextInt();
			if(TAM < 3 || TAM > 11 || TAM % 2 == 0){
				System.out.println("Número informado é diferente do solicitado\n");
			   }
		}while(TAM < 3 || TAM > 11 || TAM % 2 == 0);
		
		int[][] mat = new int[TAM][TAM];
		
			for(int i = 0; i < TAM; i++){
				System.out.println(" ");
				for(int j = 0; j < TAM; j++){
					System.out.print("Informe o "+(j+1)+"º valor da "+(i+1)+"ª linha: ");
					mat[i][j] = entrada.nextInt();
					
					if(j == 0){
						maior = mat[i][j];
						menor = mat[i][j];
					}
					if(mat[i][j] < menor){
						menor = mat[i][j];
					}
					if(mat[i][j] > maior){
						maior = mat[i][j];
					}
					if(mat[i][j] % 2 == 0){
						countPares = countPares + 1;
					}
					if(mat[i][j] % 2 != 0){
						countImpares = countImpares + 1;
					}
					if(i == j){
						somaDiagoPrin = mat[i][j];
					}
					if((i + j) == i + 1){
						somaDiagoSec = mat[i][j];
					}
					
					soma = soma + mat[i][j];
					count = count + 1;
				}
			}
			
			try{
			FileWriter arquivo = new FileWriter("C:/Users/c.agronomia/Documents/Matriz.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			gravarArquivo.print("Dados Matriz");
			System.out.println("\nA soma dos valores informados é: "+soma);
			gravarArquivo.println("\nA soma dos valores informados é: "+soma);
			
			media = soma /count;
			System.out.println("A média é igual a: "+media);
			gravarArquivo.println("A média é igual a: "+media);
			
			System.out.println("Maior valor informado: "+maior);
			gravarArquivo.println("Maior valor informado: "+maior);
			
			System.out.println("Menor valor informado: "+menor);
			gravarArquivo.println("Menor valor informado: "+menor);
			
			System.out.println("Quantidade de pares informados: "+countPares);
			gravarArquivo.println("Quantidade de pares informados: "+countPares);
			
			System.out.println("Quantidade de ímpares informados: "+countImpares);
			gravarArquivo.println("Quantidade de ímpares informados: "+countImpares);
			
			System.out.println("A soma da diagonal principal é igual a: "+somaDiagoPrin);
			gravarArquivo.println("A soma da diagonal principal é igual a: "+somaDiagoPrin);
			
			System.out.println("A soma da diagonal secundária é igual a: "+somaDiagoSec);
			gravarArquivo.println("A soma da diagonal secundária é igual a: "+somaDiagoSec);
			
			System.out.println("Matriz informada:");
			gravarArquivo.println("Matriz informada:");
			for(int i = 0; i < mat.length; i++){
				for(int j = 0; j < mat.length; j++){
					if(j != 0){
						System.out.println(mat[i][j]);
						gravarArquivo.println(mat[i][j]);
					}
				}
			}
			arquivo.close();
			entrada.close();
			} catch(IOException e) {
				System.out.println("Erro na gravação do arquivo"+
				e.getMessage());
			}
			System.out.println("Arquivo gravado com sucesso!");
			
	}

}
