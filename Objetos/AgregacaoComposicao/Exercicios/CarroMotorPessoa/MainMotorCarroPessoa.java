package AgregacaoComposicao.Exercicios.CarroMotorPessoa;

public class MainMotorCarroPessoa {

	public static void main(String[] args) {
		
		Motor m = new Motor();
		m.setCilindros(360);
		m.setCombustivel("Gasolina");
		m.setMarca("Fiat");
		m.setPotencia(120);
		System.out.println(m);
		
		Pessoa p = new Pessoa();
		p.setNome("Jônatas");
		p.setEndereco("Rua Tamoios 345");
		System.out.println(p);
		
		Carro c = new Carro();
		c.setAno(2013);
		c.setCor("Vermelho");
		c.setDono(p);
		c.setFabricante("Fiat");
		c.setModelo("Fiat Stilo");
		c.setMotor(m);
		System.out.println(c);

	}

}
