package lista1;

import javax.swing.JOptionPane;

/*
 Faça um programa que peça ao usuário para informar 03 números e mostre o menor entre eles. Considere que o usuário não poderá informar números iguais. 
*/

public class Exercicio3 {

	public static void main(String[] args) {

		int valor1;
		int valor2;
		int valor3;

		JOptionPane.showMessageDialog(null,
				"Informe TRÊS números DIFERENTES! O programa evidenciará o menor dentre eles.");
		do {
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o PRIMEIRO valor:"));
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o SEGUNDO valor:"));
			valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o TERCEIRO valor:"));

			if ((valor1 == valor2) || (valor1 == valor3) || (valor2 == valor3)) {
				JOptionPane.showMessageDialog(null, "Você informou números iguais! Forneça um valor diferente.", "Erro",
						JOptionPane.WARNING_MESSAGE);
			}

		} while ((valor1 == valor2) || (valor1 == valor3) || (valor2 == valor3));

		if ((valor1 < valor2) && (valor1 < valor3)) {
			JOptionPane.showMessageDialog(null,
					"O MENOR número dentre todos os três informados anteriormente é o " + valor1 + "!");
		} else if ((valor2 < valor1) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null,
					"O MENOR número dentre todos os três informados anteriormente é o " + valor2 + "!");
		} else if ((valor3 < valor1) && (valor3 < valor2)) {
			JOptionPane.showMessageDialog(null,
					"O MENOR número dentre todos os três informados anteriormente é o " + valor3 + "!");
		}
	}
}

//Não posso declarar variáveis dentro do Do-While!

//Poderia ter feito validando ANTES o primeiro e o segundo valor informado pelo usuário, caso fosse diferente aí sim
//o usuário informaria somente o último valor (repetir somente o valor informado igual).