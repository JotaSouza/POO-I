package Datas;

import java.util.Calendar;
import java.util.Date;
//import java.util.Iterator;
//import java.util.List;

public class MainListaDias {

	public static void main(String[] args) {
		
		
		//List<Date> lista = ListaDatas.retornaData(8, 2019);
	//	for(Iterator iter = lista.iterator());

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
	}

}
