package Calendario;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataPagamento {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.DAY_OF_MONTH,2);
        calendario.set(Calendar.MONTH, 9);
        calendario.set(Calendar.YEAR, 2019);
        calendario.set(Calendar.HOUR_OF_DAY, 23);
        Date hj = calendario.getTime();
        
        //---1 parcela = 30 dias!!!
		List<Date> ListaPagamentos = FuncoesData.Parcelas(5, calendario);
		
		if (ListaPagamentos.isEmpty())
			System.out.println("Não há parcelas! Pagamento à vista ou parcela indefinida...");
		else {
			System.out.println("As datas de vencimento de suas parcelas, a partir de "+FuncoesData.FormataData(hj)+" são:\n\n");
			for (Iterator<Date> i = ListaPagamentos.iterator(); i.hasNext();){
	            Date parcela = (Date) i.next();
	            System.out.println(FuncoesData.FormataData(parcela));
			}
		}
        

	}

}
