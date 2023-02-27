package lista1;

import javax.swing.JOptionPane;

/*
Desenvolva um programa que pergunte qual é a maioridade civil do seu “estado/país” e que posteriormente o usuário informe sua idade. Como resultado, o 
programa deve informar se ele é ou não maior de idade.
*/

public class Exercicio2 {

	public static void main(String[] args) {

		int maioridadePais = 0;
		int idadeUsuario = 0;

		maioridadePais = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a maioridade no seu Estado/País?"));
		idadeUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));

		if (maioridadePais > idadeUsuario) {
			JOptionPane.showMessageDialog(null, "Você é MENOR de idade!", "Diante dos dados fornecidos, temos que:",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Você é MAIOR de idade!", "Diante dos dados fornecidos, temos que:",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
