package lista2;

/*
Escreva um programa que receba quatro notas do aluno e as insira em um vetor. 
Depois, calcule a média aritmética entre as quatro notas e mostre o "conceito" do aluno conforme as instruções: 

- 9.0 ou maior = Conceito A
- entre 8.0 e 8.9 = Conceito B
- entre 7.0 e 7.9 = Conceito C
- menor que 7.0 = Conceito D
*/

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		int[] vetor = new int[4];
		int acumuladora = 0;
		String conceito = "";

		for (int c = 0; c < 4; c++) {
			vetor[c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira aqui suas notas:"));

			acumuladora = acumuladora + vetor[c];
			
		}

		if (acumuladora / 4 >= 9) {
			conceito = "Conceito A";

		} else if ((acumuladora / 4 >= 8) && (acumuladora / 4 < 9)) {
			conceito = "Conceito B";

		} else if ((acumuladora / 4 >= 7) && (acumuladora / 4 < 8)) {
			conceito = "Conceito C";

		} else if (acumuladora / 4 < 7) {
			conceito = "Conceito D";
		}
		
		JOptionPane.showMessageDialog(null, "De acordo com a sua média, você tirou " + conceito + "!");
	}
}
