package lista2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
Faça um programa que solicite alguns dados dos usuários que frequentam um clube. O programa deve solicitar a idade, se a 
pessoa é fumante ou não (1- SIM, 2- NÃO), seu salário líquido e há quanto tempo frequenta o clube (em meses). O usuário deverá 
digitar “encerrar” quando não tiver mais pessoas para registrar.  Como dados de saída, o programa deve exibir:

* A média das idades das pessoas;
* A média salarial das pessoas;
* Quantos são fumantes e quantos não são fumantes;
* A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 
*/

public class Exercicio5 {

	public static void main(String[] args) {

		String continuar = "Sim";
		DecimalFormat df = new DecimalFormat("0.00");
		int idade;
		int qtdePessoas = 0;
		int somaIdades = 0;
		int fumante;
		int salario;
		int tempo;
		int somaSalarios = 0;
		int somaFumantes = 0;
		int somaNaoFumantes = 0;
		int maisTempo = 0;

		while (continuar.equalsIgnoreCase("Sim")) {
			qtdePessoas = qtdePessoas + 1;

			idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
			somaIdades = idade + somaIdades;

			fumante = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Você é fumante?" + "\n1 - Sim" + "\n2 - Não"));
			if (fumante == 1) {
				somaFumantes = somaFumantes + 1;
			} else {
				somaNaoFumantes = somaNaoFumantes + 1;
			}

			salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu salário?"));
			somaSalarios = salario + somaSalarios;

			tempo = Integer
					.parseInt(JOptionPane.showInputDialog(null, "A quanto tempo (meses) você frequenta o clube?"));
			if (tempo > 3) {
				maisTempo = maisTempo + 1;
			}

			continuar = JOptionPane.showInputDialog(null,
					"Ainda restam pessoas para responder a esta Pesquisa? Se sim, digite 'Sim', caso não, digite 'Encerrar'.");
		}

		JOptionPane.showMessageDialog(null, "Média das idades das pessoas: " + (somaIdades / qtdePessoas));
		JOptionPane.showMessageDialog(null, "Média salarial das pessoas: R$" + df.format(somaSalarios / qtdePessoas));
		JOptionPane.showMessageDialog(null, "São fumantes: " + somaFumantes);
		JOptionPane.showMessageDialog(null, "Não são fumantes: " + somaNaoFumantes);
		JOptionPane.showMessageDialog(null, "Porcentagem de pessoas que frequentam o clube há mais de 03 meses: "
				+ ((100 * maisTempo) / qtdePessoas) + "%");
	}
}
