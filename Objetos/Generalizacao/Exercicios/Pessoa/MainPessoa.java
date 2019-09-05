package Generalizacao.Exercicios.Pessoa;

public class MainPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Jonatas");
		p1.setEndereco("Rua da Couves nº120");
		
		System.out.println(p1.toString());
		
		PessoaFisica pesF = new PessoaFisica();
		
		pesF.setCpf("003.104.384-07");
		pesF.setEstadoCivil("Solteiro");
		System.out.println(pesF.toString());
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Arroz Soltinho");
		pj1.setEndereco("Estrada Geral s/n");
		pj1.setCnpj("000.105.339/002-9");
		pj1.setTipoEmpresa("MEI");
		System.out.println(pj1.toString());

	}


}
