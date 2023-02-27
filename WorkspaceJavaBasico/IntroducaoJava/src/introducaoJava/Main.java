package introducaoJava;

//importando classe JOptionPane para usarmos os painéis de diálogo
import javax.swing.JOptionPane; //o conjunto inteiro de javax.swing.JOptionPane é uma biblioteca

/*
Aprofundando um pouco, o Swing é um toolkit GUI (Graphical User Interface), ou seja, um kit de ferramentas para melhorar 
a interface de uso da linguagem.
*/

public class Main { // esse public aqui, permite que minha classe Principal seja acessada por
					// qualquer outra classe; e se eu não quiser que seja pública, eu tiro o
					// "public" da frente?

	public static void main(String[] args) { // valor guardado na memória volátil do PC, é tipo cache;

		int[] valores = new int[10];

		// receber e guardar os 10 números
		for (int i = 0; i < 10; i++) { // estrutura PARA-FACA
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
			while (valores[i] < 0) { // Utilizo Integer.parseInt quando eu tenho números inteiros, e preciso
										// converter uma String para Inteiro.
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Forneça somente valores positivos!"));
			}
		}

		// criando variável para armazenar se o usuário deseja encerrar o programa
		String repetir;
		// início da estrutura de repetição para o menu
		do {
			// solicitando opção do menu
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver?"
					+ "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor" + "\n 3 - Somente o último valor"
					+ "\n 4 - Ver os valores pares" + "\n 5 - Ver o maior valor"));

			// programação do menu
			switch (opcao) {
			// mostrando todos os valores
			case 1:
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], "Valor " + (i + 1),
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;

			// mostrando somente o primeiro valor
			case 2:
				JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);
				break;

			// mostrando somente o último valor
			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "Último valor", JOptionPane.INFORMATION_MESSAGE);
				break;

			// mostrando somente os valores pares
			case 4:
				String valoresPares = "";
				for (int i = 0; i < 10; i++) {
					if (valores[i] % 2 == 0) {
						if (valoresPares != "") {
							valoresPares += ", ";
						}
						valoresPares += valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares", JOptionPane.INFORMATION_MESSAGE);
				break;

			// mostrando o maior valor
			case 5:
				int acumuladora = 0;
				for (int i = 0; i < 10; i++) {
					if (valores[i] > acumuladora) {
						acumuladora = (valores[i]);
					}
				}
				JOptionPane.showMessageDialog(null, acumuladora, "Maior valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// caso a opção seja inválida
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.WARNING_MESSAGE);
				break;
			}

			// solicitando se o usuário deseja voltar ao menu
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar:");
			// fim da estrutura de repetição para o menu
		} while (repetir.equalsIgnoreCase("S")); // copiei o IgnoreCase da Dani (pesquisar no Google)
		// } while (repetir.equals("S") || repetir.equals("s"));

	}

}