package introducaoAMetodos;

// Importando biblioteca/paineis de diálogo
import javax.swing.JOptionPane;

// Função Principal do programa
public class Main {

	public static void main(String[] args) {

		int value1, value2, resultSoma = 0;

		// Recebe e guarda dois valores
		value1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o 1º valor."));
		value2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o 2º valor."));

		// Realiza a soma dos valores anteriores
		resultSoma = value1 + value2;

		// Imprime o resultado dá soma em tela
		JOptionPane.showMessageDialog(null, resultSoma, "Soma:",
				JOptionPane.INFORMATION_MESSAGE);

	}
}


