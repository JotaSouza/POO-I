package Datas;

import java.util.Calendar;
import java.util.Date;

public class ExData2 {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 28);
		calendario.set(Calendar.MONTH, 7);
		calendario.set(Calendar.YEAR, 1984);
		calendario.set(Calendar.HOUR_OF_DAY, 12);
		calendario.set(Calendar.MINUTE, 03);
		calendario.set(Calendar.SECOND, 27);
		
		Date date = calendario.getTime();
		System.out.println("Jota nasceu em: " + date);

	}

}
