package JavaIO_CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) throws IOException {
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Calendar dataNascimento = Calendar.getInstance();
		Pessoa p = new Pessoa();
		
		p.setCodigo(1);
		p.setNome("Nathy");
		lista.add(p);
		
		p = new Pessoa();
		p.setCodigo(2);
		p.setNome("Fernanda");
		lista.add(p);
		
		Scanner ler = new Scanner(System.in);
		FileWriter arquivo = new FileWriter("agenda.csv");
		PrintWriter gravaArquivo = new PrintWriter(arquivo);
		
		for (Pessoa pessoa : lista) {
			gravaArquivo.printf("%d;%s\n", pessoa.getCodigo(), pessoa.getNome());
		}
		
		arquivo.close();
		
		try {
			FileReader arquivo1 = new FileReader("agenda.csv");
			BufferedReader lerArquivo = new BufferedReader(arquivo1);
			String linha = lerArquivo.readLine();
			lista = new ArrayList<Pessoa>();
			while (linha != null) {
				String[] leitura = linha.split(";");
				p = new Pessoa();
				p.setCodigo(Integer.parseInt(leitura[0]));
				p.setNome(leitura[1]);
				lista.add(p);
				linha = lerArquivo.readLine();				
			}
			arquivo1.close();
		} catch (Exception e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
		
		ler.close();

	}

}
