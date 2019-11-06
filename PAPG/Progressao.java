package PAPG;

public class Progressao {
	
	private int razao;
	private int a1;
	private int quantDeElementos;
	private TipoProgressao tipo;
	private GravaJson json;
	
	public TipoProgressao getTipo() {
		return tipo;
	}
	public void setTipo(TipoProgressao tipo) {
		this.tipo = tipo;
	}
	
	public int getRazao() {
		return razao;
	}
	public void setRazao(int razao) {
		this.razao = razao;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getQuantDeElementos() {
		return quantDeElementos;
	}
	public void setQuantDeElementos(int quantDeElementos) {
		this.quantDeElementos = quantDeElementos;
	}
	
	public int[] calculaPa() {
		int[] elementos = new int[quantDeElementos];
		int media = 0;
		int somatoria = 0;
		int meio = 0;
		for(int i = 0; i < quantDeElementos; i++) {
			//System.out.print(a1+" ");
			elementos[i] = a1+= razao;
			media = media + elementos[i];
			somatoria += elementos[i];
		}
		media  = media / quantDeElementos;
		meio = (a1 + elementos.length - 1)/2;
		System.out.println(media);
		System.out.println(somatoria);
		System.out.println(meio);
		return elementos;
	}
	
	public int[] calculaPg() {
		int[] elementos = new int[quantDeElementos];
		for(int i = 0; i < quantDeElementos; i++) {
			System.out.print(a1+" ");
			elementos[i] = a1*= razao;
			
		}
		return elementos;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Progressao [razao=");
		builder.append(razao);
		builder.append(", a1=");
		builder.append(a1);
		builder.append(", quantDeElementos=");
		builder.append(quantDeElementos);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
		
}
