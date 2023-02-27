package introducaoAMetodos;

import javax.swing.JOptionPane;

public class EnsaioMetodos {

	public static void main(String[] args) {

		int num1 = 0;
		num1 = recebeNum1();

		int num2 = 0;
		num2 = recebeNum2();

		JOptionPane.showMessageDialog(null, num1 + num2, "Soma de Valor 1 com Valor 2",
				JOptionPane.INFORMATION_MESSAGE);

		/*
		 * Mostra o que o programa irá retornar em tela para o usuário:
		 * System.out.println(num1 + num2);
		 */
	}

	public static int recebeNum1() {
		int num1;
		return num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
	}

	public static int recebeNum2() {
		int num2;
		return num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
	}
}
