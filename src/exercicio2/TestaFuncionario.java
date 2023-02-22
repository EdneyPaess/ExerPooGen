package exercicio2;

import Exercicios.Cliente;

public class TestaFuncionario {
	public static void main(String[] args) {
		
		Funcionario cli1 = new Funcionario("edney", 24, " Rua dos pernambucanos ", 229, "X", "Y", "Sp");
		cli1.visualizar();

		Funcionario cli2 = new Funcionario ("Elaine", 20, " Rua dos pernambucanos ", 229, "X", "Y", "Sp");
		cli2.visualizar();
	}

}
