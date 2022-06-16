package br.edu.univas.si5.bd2.DAO;

import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Removes {
	
	private Scanner scan;
	public void removeVeiculo() {
		scan = new Scanner(System.in);
		EntityManager em = HibernateUtil.getEntityManager();
		
		System.out.println("Digite a chave do veículo a ser deletado:");
		Veiculo objVeic = em.find(Veiculo.class, scan.nextInt());
		scan.nextLine();
		
		if (objVeic != null) {
			DetalheVeiculo objDet = em.find(DetalheVeiculo.class, objVeic.getDetalheVeiculo().getModelo());
			Set<Revisoes> objRev = objVeic.getRevisoes();
			
			em.getTransaction().begin();
			if (objRev != null) {
				for (Revisoes revisoes : objRev) {
					em.remove(revisoes);	
				}
			}if (objDet != null) {
				em.remove(objDet);	
			}			
			em.remove(objVeic);
			em.getTransaction().commit();
			System.out.println("Objeto removido com sucesso!!!");
		}else {
			System.out.println("Objeto não encontrado");
		}
		
		
	}
	public void removeRevisao() {
		scan = new Scanner(System.in);
		EntityManager em = HibernateUtil.getEntityManager();
		
		System.out.println("Digite a chave da revisão a ser deletada:");
		Revisoes objRev = em.find(Revisoes.class, scan.nextInt());
		scan.nextLine();
		
		if(objRev != null) {
			em.getTransaction().begin();
			em.remove(objRev);
			em.getTransaction().commit();
			System.out.println("Objeto removido com sucesso!!!");
		}else {
			System.out.println("Objeto não encontrado");
		}
		
	}
	
}	