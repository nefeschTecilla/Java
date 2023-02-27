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

public class Exercicio6 {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o PRIMEIRO valor:"));

		String operacao = "";
		String continuarCalculo = "";
		int result = 0;

		do {

			int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o SEGUNDO valor:"));

			operacao = JOptionPane.showInputDialog(null,
					"\nMultiplicação - digite *" + "\nDivisão           - digite /" + "\nAdição            - digite +"
							+ "\nSubtração      - digite -",
					"Com qual operação você deseja trabalhar?", JOptionPane.INFORMATION_MESSAGE);

			if (operacao.equals("*")) {
				result = (valor1 * valor2);
			} else if (operacao.equals("/")) {
				while (valor2 == 0) {
					JOptionPane.showMessageDialog(null, "Em caso de divisão, o Divisor não pode ser '0'!", "Erro",
							JOptionPane.WARNING_MESSAGE);
					valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe novamente o SEGUNDO valor:"));
				}
				result = (valor1 / valor2);
			} else if (operacao.equals("+")) {
				result = (valor1 + valor2);
			} else if (operacao.equals("-")) {
				result = (valor1 - valor2);
			} else
				JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Levando em consideração às suas escolhas temos que:" + "\n" + valor1
					+ operacao + valor2 + " = " + result);

			continuarCalculo = JOptionPane.showInputDialog(null,
					"Você deseja continuar calculando? Digite S para 'sim' ou qualquer outra coisa para Sair!");

			valor1 = result;

		} while (continuarCalculo.equalsIgnoreCase("S"));
	}
}

/*
 * Sempre que eu utilizar String (em específico), para igualar a alguma coisa,
 * devo utilizar o "equals"!
 */
