package Deitel;

import javax.swing.JOptionPane;

public class Janela1 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		String mensagem = ("Bem-vindo "+ nome+"!");
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
