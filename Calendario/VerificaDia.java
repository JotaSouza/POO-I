package Calendario;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class VerificaDia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a data, no formato \"dd/mm/aaaa\": ");
		String data = entrada .next();
		int dia = Integer.parseInt(data.substring(0,2));
	    int mes = Integer.parseInt(data.substring(3, 5));
	    int ano = Integer.parseInt(data.substring(6));
		while (data.charAt(2)!='/' && data.charAt(5)!='/'){
			System.out.print("\n\nData inválida. Digite a data, no formato \"dd/mm/aaaa\": ");
			data = entrada .next();
		}
		
		try {
		       
		       Calendar calendario = Calendar.getInstance();
		       calendario.set(Calendar.DAY_OF_MONTH, dia);
		       calendario.set(Calendar.MONTH, mes-1);
		       calendario.set(Calendar.YEAR, ano);
		       Date day = calendario.getTime();
		       String diaSemana;
		       
		       switch (calendario.get(Calendar.DAY_OF_WEEK)){
		    	   case 1:
		    		   diaSemana="Domingo";
		    		   break;
		    	   case 2:
		    		   diaSemana="Segunda-Feira";
		    		   break;
		    	   case 3:
		    		   diaSemana="Terça-Feira";
		    		   break;
		    	   case 4:
		    		   diaSemana="Quarta-Feira";
		    		   break;
		    	   case 5:
		    		   diaSemana="Quinta-Feira";
		    		   break;
		    	   case 6:
		    		   diaSemana="Sexta-Feira";
		    		   break;
		    	   case 7:
		    		   diaSemana="Sábado";
		    		   break;
	    		   default:
	    			   diaSemana="Inválido";
	    			   break;
		       }
		       System.out.println("O dia "+FuncoesData.FormataData(day)+" cai em um(a) "+diaSemana);
		       
		} catch (NumberFormatException e) {
		  System.out.println("Formato errado!");
		} finally {
		  entrada.close();
		}

	}

}
