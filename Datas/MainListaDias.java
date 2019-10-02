package Datas;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MainListaDias {

	public static void main(String[] args) {
		
		
		List<Date> lista = ListaDatas.retornaData(9, 2019);
		for(Iterator<Date> iter = lista.iterator(); iter.hasNext();){
			Date elemento = (Date) iter.next();
			System.out.println(elemento);
		}

		System.out.println("");
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 28);
		calendario.set(Calendar.MONTH, 7);
		calendario.set(Calendar.YEAR, 1984);
		calendario.set(Calendar.HOUR_OF_DAY, 12);
		calendario.set(Calendar.MINUTE, 03);
		calendario.set(Calendar.SECOND, 27);
		Date date = calendario.getTime();
		
		Date hoje = new Date();
		
		long segundos = ListaDatas.segundosEntreDatas(date, hoje);
		System.out.println(segundos);
		
		System.out.println("");
		
		Calendar calendario2 = Calendar.getInstance();
		calendario2.set(Calendar.DAY_OF_MONTH, 28);
		calendario2.set(Calendar.MONTH, 7);
		calendario2.set(Calendar.YEAR, 1984);
		calendario2.set(Calendar.HOUR_OF_DAY, 12);
		calendario2.set(Calendar.MINUTE, 03);
		calendario2.set(Calendar.SECOND, 27);
		Date data = calendario.getTime();
		
		Date hoj = new Date();
		
		double dias = ListaDatas.diferencaEmDias(data, hoj);
		System.out.println(dias);
		
	}

}
