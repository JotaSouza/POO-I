package Datas;

public class Calendario {

	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//valida a data
	public void dataValida(int dia, int mes, int ano) {
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia > 30 || dia <= 0) {
				System.out.println("Dia informado � inv�lido");
			} else {
				System.out.println("Dia informado � v�lido");
				this.dia = dia;
			}
	    } else if(mes == 2) {
	    	if(dia > 29 || dia <= 0) {
	    		System.out.println("Dia informado � inv�lido");
	    	}else {
	    		System.out.println("Dia informado � v�lido");
	    		this.dia = dia;
	    	}
	    }else {
	    	if(dia < 31 || dia > 0 ) {
	    		System.out.println("Dia informado � v�lido");
	    	}else {
	    		System.out.println("Dia informado n�o � valido");
	    		this.dia = dia;
	    	}
	    }
		
		if(mes > 12 || mes <= 0) {
			System.out.println("M�s informado � inv�lido");
		}else {
			System.out.println("M�s informado � v�lido");
			this.mes = mes;
		}
		
		if(ano < 0) {
			System.out.println("Ano informado � inv�lido");
		}else {
			System.out.println("Ano informado � v�lido");
			this.ano = ano;
		}
	}
	
	//verifica se o ano � bissexto
	public boolean anoBissexto(int ano) {
		if(((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			return true;
		}
		return false;

	}
	
	//escreve a data por extenso
	 public void escreveData(int dia, int mes, int ano) {
		 String escreveMes = "";
		if(mes > 0 && mes <= 12) { 
			 if(mes == 1) {
				 escreveMes = "Janeiro";
			 }else if (mes == 2) {
				 escreveMes = "Fevereiro";
			 }else if(mes == 3) {
				 escreveMes = "Mar�o";
			 }else if (mes == 4) {
				 escreveMes = "Abril";
			 }else if (mes == 5) {
				 escreveMes = "Maio";
			 }else if (mes == 6) {
				 escreveMes = "Junho";
			 }else if (mes == 7) {
				 escreveMes = "Julho";
			 }else if (mes == 8) {
				 escreveMes = "Agosto";
			 }else if (mes == 9) {
				 escreveMes = "Setembro";
			 }else if (mes == 10) {
				 escreveMes = "Outubro";
			 }else if (mes == 11) {
				 escreveMes = "Novembro";
			 }else {
				 escreveMes = "Dezembro";
			 }
			 
			 System.out.println(dia + " de " + escreveMes + " de " + ano);
		} else {
			System.out.println("Data informada n�o � v�lida!");
		}		 
		
	 }
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calendario [dia=");
		builder.append(dia);
		builder.append(", mes=");
		builder.append(mes);
		builder.append(", ano=");
		builder.append(ano);
		builder.append("]");
		return builder.toString();
	}
	
}
