package lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
6) Uma empresa deseja saber alguns dados sobre suas vendas no passado. Faça um programa que armazene em um vetor o 
valor total das vendas de cada um dos 12 meses do ano (que deverá ser informado pelo usuário) e mostre:
O mês com a maior venda;
O mês com a menor venda;
A média das vendas do ano todo;
A média das vendas dos meses pares;
A média das vendas do 2º semestre.
*/

public class Exercicio6 {

	public static void main(String[] args) {

		double [] meses = new double[13];
		double somaMensal = 0;
		double mediaAnual = 0;
		double somaPares = 0;
		double mediaPares = 0;
		double somaSemestre2 = 0;
		double mediaSemestre2 = 0;

		for (int c1 = 1; c1 < 13; c1++) {
			meses[c1] = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o valor total das vendas do " + c1 + "º mês do ano:"));
		}

		double acumuladoraMaiorValor = 0;
		double acumuladoraMenorValor = 0;

		for (int c2 = 1; c2 < 13; c2++) {

			somaMensal = meses[c2] + 1;
			mediaAnual = somaMensal / 12;

			if (meses[c2] > acumuladoraMaiorValor) {
				acumuladoraMaiorValor = (meses[c2]);

				acumuladoraMenorValor = meses[1];

			} else if (meses[c2] < acumuladoraMenorValor) {
				acumuladoraMenorValor = (meses[c2]);
			}
		}

		somaPares = meses[2] + meses[4] + meses[6] + meses[8] + meses[10] + meses[12];
		mediaPares = somaPares / 6;
		somaSemestre2 = meses[7] + meses[8] + meses[9] + meses[10] + meses[11] + meses[12];
		mediaSemestre2 = somaSemestre2 / 6;

		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "O MAIOR valor é: " + df.format(acumuladoraMaiorValor) + "!");
		JOptionPane.showMessageDialog(null, "O MENOR valor é: " + df.format(acumuladoraMenorValor) + "!");
		JOptionPane.showMessageDialog(null, "A MÉDIA das vendas do ano todo é: " + df.format(mediaAnual) + "!");
		JOptionPane.showMessageDialog(null, "A MÉDIA das vendas dos meses PARES é: " + df.format(mediaPares) + "!");
		JOptionPane.showMessageDialog(null, "A MÉDIA das vendas do 2º SEMESTRE do ano é: " + df.format(mediaSemestre2) + "!");

		/*
		 * System.out.println(acumuladoraMenorValor); <- Esse comando serve para printar
		 * no console determinado valor que desejo ao final do meu programa!
		 */

	}
}
