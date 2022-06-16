package br.edu.univas.si5.bd2.ProjetoTrabBDD2;

import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Removes {
	
	public static void main (String [] args) {
		
		EntityManager em = HibernateUtil.getEntityManager();
		int pkVeic = 7;
		int pkRev = 1;
		int pkDetVeic = 2;
		
	//	removeVeiculo(em,pkVeic);
		removeRevisao(em,pkRev);
		
	}
	
	public static void removeVeiculo(EntityManager em, int pk) {
		Veiculo objVeic = em.find(Veiculo.class, pk);
		
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

	public static void removeRevisao(EntityManager em, int pk) {
		
		Revisoes objRev = em.find(Revisoes.class, pk);
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