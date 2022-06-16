package br.edu.univas.si5.bd2.view;

public class View {
	
	public void mainMenu() {
		System.out.println("Bem vindo ao programinha maluco de cadastro de veículos:\n"
				+ "Digite uma opção: \n"
				+ "1 - Adicionar: \n"
				+ "2 - Consultas: \n"
				+ "3 - Updates: \n"
				+ "4 - Exclusões: \n"
				+ "9 - Sair: ");
			
	}
	public void menuOpt1 () {
		System.out.println("Selecione uma Opção: \n"
				+ "1 - Adicionar Veículo: \n"
				+ "2 - Adicionar Revisão: \n"
				+ "3 - Sair \n");
	}
	public void menuOpt2() {
		System.out.println("Selecione uma Opção: \n"
				+ "1 - Consulta Veículo: \n"
				+ "2 - Consulta Revisão: \n"
				+ "3 - Sair \n");
	}
	public void menuOpt3() {
		System.out.println("Selecione uma Opção: \n"
				+ "1 - Editar Detalhe do Veículo: \n"
				+ "2 - Editar Veículo: \n"
				+ "3 - Editar Revisão: \n"
				+ "4 - Sair");
	}
	public void menuOpt4() {
		System.out.println("Selecione uma Opção: \n"
				+ "1 - Excluir Veículo: \n"
				+ "2 - Excluir Revisão: \n"
				+ "3 - Sair \n");
	}
}
