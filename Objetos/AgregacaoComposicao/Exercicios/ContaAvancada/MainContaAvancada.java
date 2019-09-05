package AgregacaoComposicao.Exercicios.ContaAvancada;

public class MainContaAvancada {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Giseli");
		p.setEndereco("Rua das Flores 35");
		System.out.println(p);
		
		Banco b = new Banco();
		b.setCodigo(001);
		b.setNome("Bamerindus");
		b.setNumeroAgencias(10);
		System.out.println(b);

	}

}
