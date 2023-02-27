package lista2;

import javax.swing.JOptionPane;

/*
Faça um programa que receba um vetor de valores e mostre a quantidade de valores negativos. Os valores e o tamanho do vetor 
devem ser informados pelo usuário.
*/

public class Exercicio1 {

	public static void main(String[] args) {

		int valores = Integer
				.parseInt(JOptionPane.showInputDialog("Informe quantas posições você deseja que seu vetor tenha:"));

		int[] vetor = new int[valores];
		int aux = 0;

		for (int c = 0; c < valores; c++) {
			vetor[c] = Integer.parseInt(
					JOptionPane.showInputDialog("Forneça um valor para a " + (c + 1) + "ª posição do seu vetor:"));

			if (vetor[c] < 0) {
				aux = (aux + 1);
			}
		}

		JOptionPane.showMessageDialog(null,
				"A quantidade de valores NEGATIVOS dentro do seu vetor é igual a: " + aux + "!");
	}
}
