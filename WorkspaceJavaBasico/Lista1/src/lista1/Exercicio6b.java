package lista1;

import javax.swing.JOptionPane;

/*
Crie uma calculadora que permita o cálculo de uma equação, sem limite de execuções definido, da seguinte maneira:

1. Peça o primeiro valor ,
2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
3. Peça um segundo valor 
4. Efetue o cálculo,
5. Peça se o usuário quer continuar calculando. Se ele responder que sim, volte para o passo 2 usando o resultado do cálculo da linha 
   4 como primeiro valor, e se disser que não, mostre o resultado final . 
Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.
*/

public class Exercicio6b {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o PRIMEIRO VALOR:"));

		String operacao = "";
		String continuarCalculo = "s";
		int result = 0;

		int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o SEGUNDO VALOR:"));

		while (continuarCalculo.equals("S") || continuarCalculo.equals("s")) {

			while (!operacao.equals("*") && !operacao.equals("/") && !operacao.equals("+") && !operacao.equals("-")) {

				operacao = JOptionPane.showInputDialog(null,
						"\nMultiplicação - digite *" + "\nDivisão           - digite /"
								+ "\nAdição            - digite +" + "\nSubtração      - digite -",
						"Com qual operação você deseja trabalhar?", JOptionPane.INFORMATION_MESSAGE);
				if (!operacao.equals("*") && !operacao.equals("/") && !operacao.equals("+") && !operacao.equals("-")) {
					JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
				}
			}

			if (operacao.equals("*")) {
				result = (valor1 * valor2);
			} else if (operacao.equals("/")) {
				result = (valor1 / valor2);
			} else if (operacao.equals("+")) {
				result = (valor1 + valor2);
			} else if (operacao.equals("-")) {
				result = (valor1 - valor2);
			}

			JOptionPane.showMessageDialog(null, "Levando em consideração às suas escolhas temos que:" + "\n" + valor1
					+ operacao + valor2 + " = " + result);

			continuarCalculo = JOptionPane.showInputDialog(null,
					"Você deseja continuar calculando? Digite S para 'sim' ou qualquer outra coisa para Sair!");

			valor1 = result;
		}
	}
}

/*
 * } else { JOptionPane.showMessageDialog(null, "Opção inválida", "Erro",
 * JOptionPane.WARNING_MESSAGE); }
 * 
 * 
 * Colocar todo o código dentro de um DO!
 * 
 * 
 * O valor não pode ser 0 quando for divisão (VALIDAR ESSA QUESTÃO).
 * 
 * 
 * Sempre que eu utilizar String (em específico), para igualar a alguma coisa,
 * devo utilizar o "equals"!
 */
