package lista1;

import javax.swing.JOptionPane;
import java.util.Random;

/*
Faça uma solução que alimente um vetor com 10 valores inteiros e também que solicite ao usuário a entrada de dados de um valor inteiro qualquer. 
A solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e imprimir a posição em que este foi encontrado ou se não foi encontrado.
*/

public class Exercicio7 {

	public static void main(String[] args) {

		int[] valoresVetor = new int[10];
		Random numsAleatorios = new Random();
		boolean verificador;
		verificador = false;

		for (int i = 0; i < 10; i++) {

			valoresVetor[i] = numsAleatorios.nextInt(100);

			JOptionPane.showMessageDialog(null, "Posição de nº " + (i+1) + " - recebe o valor '" + valoresVetor[i] + "'!");

		}

		int valorUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "" + "",
				"Informe um valor inteiro qualquer:", JOptionPane.INFORMATION_MESSAGE));

		for (int i = 0; i < 10; i++) {
			if (valorUsuario == valoresVetor[i]) {
				JOptionPane.showMessageDialog(null,
						"O valor que você digitou, está guardado dentro do vetor, na posição de nº " + (i+1) + "!");
				verificador = true;
			}
		}
		if (verificador == false) {
			JOptionPane.showMessageDialog(null,
					"O valor que você digitou não foi encontrado em nenhuma posição do vetor!");
		}
	}
}
