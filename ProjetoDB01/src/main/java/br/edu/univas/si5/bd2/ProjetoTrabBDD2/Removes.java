package br.edu.univas.si5.bd2.ProjetoTrabBDD2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Removes {
	
	public static void main (String [] args) {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		int pk = 7;
		Veiculo objVeic = em.find(Veiculo.class, pk);
		
		if (objVeic != null) {
			DetalheVeiculo objDet = em.find(DetalheVeiculo.class, objVeic.getDetalheVeiculo().getModelo());
			//Revisoes objRev = em.find;
			
			em.getTransaction().begin();
		//	em.remove(objRev);
			em.remove(objVeic);
			em.remove(objDet);
			em.getTransaction().commit();
			System.out.println("Objeto removido com sucesso!!!");
		} else {
			System.out.println("Objeto não encontrado.");
		}
		
	}
	
}
