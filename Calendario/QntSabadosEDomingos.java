package Calendario;

import java.util.Calendar;
import java.util.Date;

public class QntSabadosEDomingos {

	public static void main(String[] args) {
		
		int quantSabado = 0, quantDomingo = 0;
		
		Calendar calendario1 = Calendar.getInstance();
        calendario1.set(Calendar.DAY_OF_MONTH,2);
        calendario1.set(Calendar.MONTH, 9);
        calendario1.set(Calendar.YEAR, 2019);
        calendario1.set(Calendar.HOUR_OF_DAY, 23);
        
        Calendar calendario2 = Calendar.getInstance();
        calendario2 .set(Calendar.DAY_OF_MONTH,2);
        calendario2 .set(Calendar.MONTH, 10);
        calendario2 .set(Calendar.YEAR, 2019);
        calendario2 .set(Calendar.HOUR_OF_DAY, 1);
        
        Date inicio = calendario1.getTime();
        Date fim = calendario2.getTime();
        
        for(int i = 0; i <= FuncoesData.totalDias(inicio, fim);i++){
        	if (FuncoesData.verificaData(calendario1)==2)
        		quantSabado++;
        	else if (FuncoesData.verificaData(calendario1)==1)
        		quantDomingo++;
        	calendario1.add(Calendar.DATE, 1);
        }
        
        System.out.println("A quantidade de sábados entre "+ FuncoesData.FormataData(inicio)+" e " + FuncoesData.FormataData(fim)+" é: " + quantSabado + ".\nA de domingos é : " + quantDomingo +".");

	}


}
