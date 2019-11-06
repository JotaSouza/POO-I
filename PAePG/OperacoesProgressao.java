package PAePG;

public class OperacoesProgressao {

	private double a1, razao;
	private int quantidade;
	private TipoProgressao tipo;
	
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getRazao() {
		return razao;
	}
	public void setRazao(double razao) {
		this.razao = razao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public TipoProgressao getTipo() {
		return tipo;
	}
	public void setTipo(TipoProgressao tipo) {
		this.tipo = tipo;
	}
	
	public double[] PA() {
		int contador = 1;
		double[] num = new double[quantidade];
		for (int i = 0; i < quantidade; i++) {
			if(contador == 1) {
				num[i] = a1;
			} else {
				num[i] = a1 + ((contador-1)*razao);
			}
			contador++;
		}
		return num;		
	}
	
	public double[] PG() {
		int contador = 1;
		double[] num = new double[quantidade];
		for(int i = 0; i < quantidade; i++) {
			if(contador == 1) {
				num[i] = a1;
			} else {
				num[i] = a1 * Math.pow(razao, contador - 1);
			}
			contador++;
		}
		return num;
	}
	
	public double retornaA1(double[] array) {
		return array[0];
	}
	
	public double retornaRazaoPa(double[] array) {
		double num = array[1] - array[0];
		return num;
	}
	
	public double retornaRazaoPg(double[] array) {
		double num = array[1] / array[0];
		return num;
	}
	
	public double retornaQuantidade(double[] array) {
		int quantidade = array.length;
		return quantidade;
	}
	
	public double somatoria(double[] array) {
		double soma = 0;
		for(int i = 0; i < array.length; i++) {
			soma+= array[i];
		}
		return soma;
	}
	
	public double media(double[] array) {
		double media = 0;
		media = somatoria(array) / retornaQuantidade(array);
		return media;
	}
	
	public double mediana(double[] array) {
		double mediana = 0;
		if(array.length / 2 == 0) {
			int esquerda = 0;
			int direita = array.length - 1;
			int meio = (esquerda + direita) / 2;
			mediana = array[meio];			
		} else {
			int p1, p2;
			p1 = (array.length / 2) - 1;
			p2 = p1 + 1;
			mediana = (array[p1] + array[p2]) / 2;
		}
		return mediana;
	}
	
	public String PaOuPg(double[] array) {
		if(array[1] == array[2] - retornaRazaoPa(array)) {
			return "PA";
		} else if (array[1] == array[2] / Math.pow(retornaRazaoPg(array), 1)) {
			return "PG";
		} else {
			return "O arquivo não é válido!";
		}
	}
	
	public boolean verificaArquivo(double[] array) {
		String result = " ";
		result = PaOuPg(array);
		if(result.equals("O arquivo não é válido!")) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OperacoesProgressao [a1=");
		builder.append(a1);
		builder.append(", razao=");
		builder.append(razao);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
}
