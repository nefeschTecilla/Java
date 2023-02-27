package introducaoAMetodos;

import javax.swing.JOptionPane;

public class IntroducaoAMetodos1 {

	public static void main(String[] args) {

		int num1 = 0;
		num1 = recebeNum1();

		int num2 = 0;
		num2 = recebeNum2();

		int soma = 0;
		soma = calculo(num1, num2);

		JOptionPane.showMessageDialog(null, soma, "A soma de Valor 1 com Valor 2 é:",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static int recebeNum1() {
		int num1;
		return num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
	}

	public static int recebeNum2() {
		int num2;
		return num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
	}

	public static int calculo(int num1, int num2) {
		int soma;
		return soma = num1 + num2;
	}

}
