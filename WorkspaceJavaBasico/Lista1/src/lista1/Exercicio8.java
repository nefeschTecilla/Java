package lista1;

import javax.swing.JOptionPane;

/*
Faça um programa que carregue os valores das vendas de uma loja no primeiro semestre do ano. Considere para tal uma matriz [6,4], sendo que são 06 meses e 04 
semanas por mês. Ao final, mostre na tela: 

● Total de vendas do semestre
● Total vendido em cada mês
*/

public class Exercicio8 {

	public static void main(String[] args) {

		double matriz[][] = new double[6][4];
		double totalVendasMes = 0;
		double totalVendasSemestre = 0;
		double valoresPosicoes = 0;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 3; j++) {
				matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog(""));
				totalVendasMes = (totalVendasMes + (matriz[i][j]));
				totalVendasSemestre = (totalVendasSemestre + (matriz[i][j]));
			}
		}

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 3; j++) {
				valoresPosicoes = ((matriz[i][j]) + valoresPosicoes);
			}
			JOptionPane.showMessageDialog(null,
					"O acumulo de vendas do " + (i + 1) + "º mês é igual a: " + valoresPosicoes);
			valoresPosicoes = 0;
		}
		JOptionPane.showMessageDialog(null, "O acumulo de vendas do SEMESTRE é igual a: R$" + totalVendasSemestre);

	}
}