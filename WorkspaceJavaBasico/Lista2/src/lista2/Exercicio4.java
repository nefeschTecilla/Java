package lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
4) Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um programa que permita ao usuário informar uma quantidade
de latão em quilos e forneça o total de cobre e zinco necessários para fabricar essa quantidade.
*/

public class Exercicio4 {

	public static void main(String[] args) {

		double opcao = 0;

		DecimalFormat df = new DecimalFormat("0.00");
		
		do {

			double latao = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Quantos Kg de Latão você deseja fabricar?"));

			double cobre = (latao * 70) / 100;
			double zinco = (latao - cobre);

			JOptionPane.showMessageDialog(null, "Para a fabricação de " + df.format(latao) + "Kg de Latão, são necessários " + df.format(cobre)
					+ "Kg de cobre, mais " + df.format(zinco) + "Kg de zinco!");

			opcao = Double
					.parseDouble(JOptionPane.showInputDialog(null, "1 - Você deseja calcular novamente?" + "\n2 - Sair"));

		} while (opcao == 1);
	}
}

