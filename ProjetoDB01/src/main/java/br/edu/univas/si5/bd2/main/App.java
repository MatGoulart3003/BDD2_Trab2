package br.edu.univas.si5.bd2.main;

import java.util.Scanner;

import br.edu.univas.si5.bd2.DAO.CreateRevisao;
import br.edu.univas.si5.bd2.DAO.CreateVeiculo;
import br.edu.univas.si5.bd2.DAO.Finds;
import br.edu.univas.si5.bd2.DAO.Removes;
import br.edu.univas.si5.bd2.DAO.Updates;
import br.edu.univas.si5.bd2.view.View;

public class App {
	
	static CreateVeiculo createVeic = new CreateVeiculo();
	static CreateRevisao createRev = new CreateRevisao();
	static Finds find = new Finds();
	static Updates update = new Updates();
	static Removes remove = new Removes();
	static View view = new View();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i = 0;
		do {			
			view.mainMenu();
			i = scanI(scan);			
			mainMenu(i);
			
		}while(i != 9);
		scan.close();
	}
	
	public static int scanI (Scanner scan) {
		int i = scan.nextInt();
		scan.nextLine();
		return i;
	}

	public static void option1 (int i) {
		if(i == 1) {
			createVeic.createVeic();
		}else if(i == 2) {
			createRev.createRevisao();
		}else if (i == 3){
			
		}else {
			System.out.println("Opção Inválida");
		}
	}
	
	public static void option2 (int i) {
		if(i == 1) {
			find.findVeic();
		}else if(i == 2) {
			find.findRevisao();
		}else if (i == 3){
			System.out.println("Opção Inválida");
		}
	}

	public static void option3 (int i) {
		if(i == 1) {
			update.updateDetalheVeiculo();
		}else if(i == 2) {
			update.updateVeiculo();
		}else if (i == 3){
			update.updateRevisoes();
		}else if (i == 4){
			
		}else {
			System.out.println("Opção Inválida");
		}
	}

	public static void option4 (int i) {
		if(i == 1) {
			remove.removeVeiculo();
		}else if(i == 2) {
			remove.removeRevisao();
		}else if (i == 3){
			
		}else {
			System.out.println("Opção Inválida");
		}
	}

	public static void mainMenu(int i) {
		if(i == 1) {
			
			view.menuOpt1();
			i = scanI(scan);
			option1(i);	
			
		}else if(i == 2) {
			
			view.menuOpt2();
			i = scanI(scan);
			option2(i);
			
		}else if(i == 3) {
			
			view.menuOpt3();
			i = scanI(scan);
			option3(i);
			
		}else if(i == 4) {
			
			view.menuOpt4();
			i = scanI(scan);
			option4(i);
			
		}else if(i != 9){
			System.out.println("Opção Inválida");				
		}
	}
}
