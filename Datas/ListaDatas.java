package Datas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ListaDatas {

	private int mes;
	private int ano;
	
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
	
	public static List<Date> retornaData(int mes, int ano) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.YEAR, ano);
		int quantidadeDias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		List<Date> listaDias = new ArrayList<Date>();
		for(int x = 1; x <= quantidadeDias; x++) {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DATE, x);
			cal.set(Calendar.MONTH, mes);
			cal.set(Calendar.YEAR, ano);
			Date hoje = cal.getTime();
			listaDias.add(hoje);
		}
		return listaDias;
	}
	
	public static long segundosEntreDatas(Date inicio, Date fim) {
		long segInicial = inicio.getTime();
		long segFinal = fim.getTime();
		long diferenca = (segFinal - segInicial) / 1000;
		return diferenca;
		
	}
	
	public static double diferencaEmDias(Date dataInicial, Date dataFinal){
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmDias = (diferenca / 1000) /60 /60 /24;
		long horasRestantes = (diferenca / 1000) /60 /60 %24;
		result = diferencaEmDias + (horasRestantes / 24d);
		return result;
	}
	
}
