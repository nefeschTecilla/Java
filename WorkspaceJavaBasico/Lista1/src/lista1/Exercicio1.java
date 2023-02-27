
package lista1;

import javax.swing.JOptionPane;

/*
Faça um algoritmo que peça para o usuário inserir uma quantidade em horas, outra em minutos e mais uma em segundos e mostre quantos segundos esse horário contém.
*/

public class Exercicio1 {

	public static void main(String[] args) {

		int hora = Integer.parseInt(JOptionPane.showInputDialog(
				"Insira três valores para formar um horário. Digite um valor correspondente a HORAS:"));
		int minuto = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor correspondente a MINUTOS:"));
		int segundo = Integer
				.parseInt(JOptionPane.showInputDialog("Forneça agora, o último valor correspondente a SEGUNDOS:"));

		JOptionPane.showMessageDialog(null, "O horário formado é igual a " + hora + ":" + minuto + ":" + segundo + "!");

		hora = hora * 3600;
		minuto = minuto * 60;

		JOptionPane.showMessageDialog(null,
				"Lenvando em consideração a CONVERSÃO de horas para segundos e minutos para segundos, o horário que você nos informou contém um total de "
						+ (hora + minuto + segundo) + " segundos!");
	}
}

//Poderia usar um DO-WHILE para não deixar o usuário informar valores negativos, ou até mesmo um Menu para solicitar se
//o usuário quer voltar ou sair do programa.