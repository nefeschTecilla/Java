package lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
Um estudante do ensino médio gostaria de controlar melhor suas notas nas disciplinas exatas. Ele gostaria de poder enxergar suas notas dos 4 bimestres
com exatamente duas casas decimais e em formato de matriz, como no exemplo a seguir:
	
	Matemática	Física     Química
	  9.53		 8.66	    8.45 
	  7.57	 	 9.00	    8.01
      8.87		 9.44	    7.88
      7.30		 6.77	    9.21
	
Além disso, o estudante gostaria de poder escolher algumas opções de visualização de acordo com o menu abaixo:
    	  
    1. Todas as notas de todas as disciplinas;
    2. Qual a maior nota e em qual disciplina foi;
    3. A média das notas de alguma disciplina (solicitar qual);
    4. As notas de um dos bimestres (solicitar qual);
    5. Encerrar.

Faça um programa que permita cadastrar as notas de acordo com o exemplo (considerando a ordem das disciplinas) e forneça os dados supracitados. O menu deve ser 
exibido repetitivamente, até que o usuário deseje encerrar o programa.
*/

public class Exercicio7 {

	public static void main(String[] args) {

		DecimalFormat d = new DecimalFormat("0.00");

		String[] materias = { "Matemática", "Física", "Química" }; // Vetor de texto que armazena três palavras
		double[][] notas = new double[4][3]; // Matriz
		int bimestre = 1;
		double soma = 0;
		String boletim = "";

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {

				notas[i][j] = Double
						.parseDouble(
								JOptionPane.showInputDialog(
										null, "Informe a " + (i + 1) + "ª nota do " + (bimestre)
												+ "º bimestre da matéria de " + materias[j] + ":",
										"Exercício 7", JOptionPane.INFORMATION_MESSAGE));

			}

			bimestre++;

		}

		String rep;

		do {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"O que você deseja ver?" + "\n 1 - Todas as notas de todas disciplinas"
							+ "\n 2 - Maior nota na disciplina desejada" + "\n 3 - Menor nota na disciplina desejada"
							+ "\n 4 - Média da disciplina desejada" + "\n 5 - Notas de algum bimestre expecífico"
							+ "\n 6 - Sair",
					"Exercício 7", JOptionPane.INFORMATION_MESSAGE));

			switch (opcao) {

			case 1:

				boletim = "Matemática    Física    Química \n";
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 3; j++) {
						boletim = boletim + "    " + d.format(notas[i][j]) + "         ";

					}
					boletim += "\n";
				}

				JOptionPane.showMessageDialog(null, boletim, "Exercício 7", JOptionPane.INFORMATION_MESSAGE);

				break;

			case 2:
				double maiorNota = 0;
				int materiaDesejada = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe a disciplina desejada: " + "\n 1 - Matemática" + "\n 2 - Fisíca" + "\n 3 - Química",
						"Exercício 7", JOptionPane.INFORMATION_MESSAGE));
				switch (materiaDesejada) {

				case 1:

					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 1; j++) {
							if (notas[i][0] > maiorNota) {
								maiorNota = notas[i][0];
							}
						}
					}
					JOptionPane.showMessageDialog(null,
							"A maior nota foi: " + maiorNota + " - disciplina " + materias[0], "Maior nota",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				case 2:

					for (int i = 0; i < 4; i++) {
						for (int j = 1; j < 2; j++) {
							if (notas[i][1] > maiorNota) {
								maiorNota = notas[i][1];
							}
						}
					}
					JOptionPane.showMessageDialog(null,
							"A maior nota foi: " + maiorNota + " - disciplina " + materias[1], "Maior nota",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				case 3:

					for (int i = 0; i < 4; i++) {
						for (int j = 2; j < 3; j++) {
							if (notas[i][2] > maiorNota) {
								maiorNota = notas[i][2];
							}
						}
					}
					JOptionPane.showMessageDialog(null,
							"A maior nota foi: " + maiorNota + " - disciplina " + materias[2], "Maior nota",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
					break;
				}

				break;

			case 3:

				double menorNota = 11;
				materiaDesejada = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe a disciplina desejada: " + "\n 1 - Matemática" + "\n 2 - Fisíca" + "\n 3 - Química",
						"Exercício 7", JOptionPane.INFORMATION_MESSAGE));
				switch (materiaDesejada) {

				case 1:

					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 1; j++) {
							if (notas[i][0] < menorNota) {
								menorNota = notas[i][0];
							}
						}
					}
					JOptionPane.showMessageDialog(null,
							"A menor nota foi: " + menorNota + " - disciplina " + materias[0], "menor nota",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				case 2:

					for (int i = 0; i < 4; i++) {
						for (int j = 1; j < 2; j++) {
							if (notas[i][1] < menorNota) {
								menorNota = notas[i][1];
							}
						}
					}
					JOptionPane.showMessageDialog(null,
							"A menor nota foi: " + menorNota + " - disciplina " + materias[1], "menor nota",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				case 3:

					for (int i = 0; i < 4; i++) {
						for (int j = 2; j < 3; j++) {
							if (notas[i][2] < menorNota) {
								menorNota = notas[i][2];
							}
						}
					}
					JOptionPane.showMessageDialog(null,
							"A menor nota foi: " + menorNota + " - disciplina " + materias[2], "menor nota",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
					break;

				}

				break;

			case 4:

				double media = 0;
				materiaDesejada = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe a disciplina desejada: " + "\n 1 - Matemática" + "\n 2 - Fisíca" + "\n 3 - Química",
						"Exercício 7", JOptionPane.INFORMATION_MESSAGE));

				for (int i = 0; i < 4; i++) {

					soma += (notas[i][materiaDesejada]);

				}
				media = soma / 4;

				JOptionPane.showMessageDialog(null, "A media foi: " + media + " - disciplina ", "menor nota",
						JOptionPane.INFORMATION_MESSAGE);
				soma = 0;

				break;

			case 5:

				materiaDesejada = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Informe a disciplina desejada: " + "\n 1 - Matemática" + "\n 2 - Fisíca" + "\n 3 - Química",
						"Exercício 7", JOptionPane.INFORMATION_MESSAGE));
				switch (materiaDesejada) {

				case 1:

					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 1; j++) {
							JOptionPane.showMessageDialog(null, "Todas as notas: " + notas[i][0], "Exercício 7",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
					break;

				case 2:

					for (int i = 0; i < 4; i++) {
						for (int j = 1; j < 2; j++) {
							JOptionPane.showMessageDialog(null, "Todas as notas: " + notas[i][1], "Exercício 7",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
					break;

				case 3:

					for (int i = 0; i < 4; i++) {
						for (int j = 2; j < 3; j++) {
							JOptionPane.showMessageDialog(null, "Todas as notas: " + notas[i][2], "Exercício 7",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
					break;
				}

				break;

			case 6:

				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
				break;

			}
			rep = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\nDigite S para sim ou outro caractere para encerrar:");

		} while (rep.equals("S") || rep.equals("s"));
	}

}