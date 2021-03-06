package br.edu.univas.si5.bd2.DAO;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Finds {
	
	private Scanner scan; 
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void findVeic () {
		scan = new Scanner(System.in);
		System.out.println("Digite a chave primária do veiculo à ser buscado");
		Veiculo objVeic = em.find(Veiculo.class, scan.nextInt()); //busca veiculo com pk 2
		scan.nextLine();
		System.out.println("\nVeiculo: " + objVeic + "\n"
				+ "Detalhes:" + objVeic.getDetalheVeiculo());
		
	}
	
	public void findRevisao() {
		scan = new Scanner(System.in);
		System.out.println("Digite a chave primária da revisão à ser buscada");
		Revisoes objRev = em.find(Revisoes.class, scan.nextInt()); //busca revisão com pk 3
		scan.nextLine();
		System.out.println("Revisão: " + objRev + " No veículo: " + objRev.getVeiculo().getProprietario() + "\n\n\n" );
		
	}
	
	
}
