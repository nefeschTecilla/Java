/*
Solicitar Ano de nascimento de determinada pessoa (fora da Main); calcular a idade dessa pessoa a partir do ano 
informado (fora da Main), e, exibir resultado/idade em tela (dentro da Main).
*/

package introducaoAMetodos;

import javax.swing.JOptionPane;

public class IntroducaoAMetodos3 {

	public static void main(String[] args) {

		int anoAtual = 2023;

		int anoNasciento = 0;
		anoNasciento = solicitaAno();

		int idade = 0;
		idade = calculoIdade(anoAtual, anoNasciento);

		JOptionPane.showMessageDialog(null, idade, "Sua idade é:", JOptionPane.INFORMATION_MESSAGE);

	}

	public static int solicitaAno() {
		int anoNasciento;
		return anoNasciento = Integer.parseInt(JOptionPane.showInputDialog("Forneça o Ano do seu nascimento:"));
	}

	public static int calculoIdade(int anoAtual, int anoNascimento) {
		int idade;
		return idade = anoAtual - anoNascimento;
	}
}
