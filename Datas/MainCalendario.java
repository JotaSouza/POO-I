package Datas;

public class MainCalendario {

	public static void main(String[] args) {
		
		Calendario data = new Calendario();
		
		data.anoBissexto(2020);
		data.escreveData(40, 5, 2016);
		data.dataValida(28, 2, 2018);
		System.out.println(data.getDia());

	}

}
