package br.edu.univas.si5.bd2.main;

import java.util.Scanner;

import br.edu.univas.si5.bd2.DAO.CreateRevisao;
import br.edu.univas.si5.bd2.DAO.CreateVeiculo;
import br.edu.univas.si5.bd2.DAO.Finds;
import br.edu.univas.si5.bd2.DAO.Removes;
import br.edu.univas.si5.bd2.DAO.Updates;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//objetos pra chamar os metodos do DAO
		CreateVeiculo createVeic = new CreateVeiculo();
		CreateRevisao createRev = new CreateRevisao();
		Finds find = new Finds();
		Updates update = new Updates();
		Removes remove = new Removes();
				
		//metodos do DAO
	//	createVeic.createVeic();
	//	createRev.createRevisao();
		find.findVeic();
		find.findRevisao();
	//	update.updateDetalheVeiculo();
	//	update.updateRevisoes();
	//	update.updateVeiculo();
	//	remove.removeRevisao();
	//	remove.removeVeiculo();
		
	}

}
