package lista1;

import javax.swing.JOptionPane;

/*
Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente quantos são pares e a soma deles, bem como quantos são ímpares e a soma deles.
*/

public class Exercicio4 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"Favor inserir 10 números abaixo (ao inserir o primeiro número, tecle Enter para poder inserir o próximo, e assim sucessivamente)");

		int qtdePares = 0;
		int somaPares = 0;
		int qtdeImpares = 0;
		int somaImpares = 0;

		for (int i = 0; i < 10; i++) {

			int valores = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));

			if (valores % 2 == 0) {
				qtdePares = (qtdePares + 1);
				somaPares = (valores + somaPares);
			} else {
				qtdeImpares = (qtdeImpares + 1);
				somaImpares = (valores + somaImpares);
			}
		}

		JOptionPane.showMessageDialog(null, qtdePares + " números são PARES, e a soma deles é igual a: " + somaPares);
		JOptionPane.showMessageDialog(null,
				qtdeImpares + " números são IMPARES, e a soma deles é igual a: " + somaImpares);

	}

}
