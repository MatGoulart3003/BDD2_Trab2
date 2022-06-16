package br.edu.univas.si5.bd2.DAO;

import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Removes {
		
	public void removeVeiculo() {
		EntityManager em = HibernateUtil.getEntityManager();
		int pkVeic = 7;
		Veiculo objVeic = em.find(Veiculo.class, pkVeic);
		
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
		EntityManager em = HibernateUtil.getEntityManager();
		int pkRev = 1;
		Revisoes objRev = em.find(Revisoes.class, pkRev);
		
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