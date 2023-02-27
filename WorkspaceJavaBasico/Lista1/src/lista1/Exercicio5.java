package lista1;

import javax.swing.JOptionPane;

/*Faça um algoritmo que mostre a soma de todos os valores pares entre um intervalo de dois números digitados pelo usuário. 
Exemplo 01.: início do intervalo: 1, final do intervalo: 8, logo, soma dos pares (2+4+6+8): 20

Exemplo 02.: início do intervalo: 2, final do intervalo: 12, logo, soma dos pares (2+4+6+8+10+12): 42 

Não é necessário mostrar os números pares, apenas a soma deles
*/

public class Exercicio5 {

	public static void main(String[] args) {

		int pontoPartida = Integer.parseInt(JOptionPane.showInputDialog(
				"Favor informar dois valore levando em consideração que o primeiro deles é o ponto inicial e o outro, o ponto final de um intervalo entre dois valores.\nInsira o primeiro valor:"));

		int pontoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

		int acumuladora = 0;

		if (pontoPartida > pontoFinal) {
			int aux = pontoPartida;
			pontoPartida = pontoFinal;
			pontoFinal = aux;

		//Poderia colocar uma mensagem informando ao usuário caso ele iniciasse com um valor maior.	
			
		}
		for (int i = pontoPartida; i <= pontoFinal; i++) {
			if (i % 2 == 0) {
				acumuladora = i + acumuladora;
			}
		}

		JOptionPane.showInternalMessageDialog(null, "A soma dos números pares é igual a: " + acumuladora + "!");

	}
}
