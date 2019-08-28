package ListaObjetosI;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Pessoa pessoa = new Pessoa();
		String nome;
		int idade;
		float peso;
		float altura;
		
		do {
		System.out.print("Informe o nome: ");
		nome = entrada.nextLine();
		}while (nome.length() == 0);
		do {
		System.out.print("Informe a idade: ");
		idade = entrada.nextInt();
		}while (idade < 0);
		do {
		System.out.print("Informe o peso: ");
		peso = entrada.nextFloat();
		}while (peso <= 0);
		do {
		System.out.print("Informe a altura: ");
		altura = entrada.nextFloat();
		}while (altura <= 0);
		
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		pessoa.setPeso(peso);
		pessoa.setAltura(altura);

		pessoa.emagrecer();
		System.out.println(pessoa);
		pessoa.engordar();
		System.out.println(pessoa);
		pessoa.envelhecer();
		System.out.println(pessoa);
		
		
		entrada.close();

	}

}
