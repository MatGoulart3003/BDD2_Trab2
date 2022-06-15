package br.edu.univas.si5.bd2.ProjetoTrabBDD2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Updates {
	
	public static void main (String[] args) {
		
		EntityManager em = HibernateUtil.getEntityManager();
		em = HibernateUtil.getEntityManager();
		
		updateDetalheVeiculo(em);
		updateVeiculo(em);
		updateRevisoes(em);
		
	}
	
	private static void updateDetalheVeiculo(EntityManager em){
				
		String pk = "Fusca";
		DetalheVeiculo objDet = em.find(DetalheVeiculo.class, pk);
		
		if (objDet != null) {
			objDet.setMarca("VolksWagem");
			em.getTransaction().begin();
			em.merge(objDet); 
			em.getTransaction().commit();
			System.out.println("Objeto editado com sucesso!");

		}else {
			System.out.println("Objeto " + objDet + " não encontrado.");
		}
	}
	
	private static void updateVeiculo(EntityManager em) {
		
		int pk = 7;
		Veiculo objVeic = em.find(Veiculo.class, pk);
		
		if (objVeic != null) {
			objVeic.setProprietario("Rodrigo Faro");
			objVeic.setSenha_prop("UUUUUUIIII");
			em.getTransaction().begin();
			em.merge(objVeic); 
			em.getTransaction().commit();
			System.out.println("Objeto editado com sucesso!");

		}else {
			System.out.println("Objeto " + objVeic + " não encontrado.");
		}
		
	}
	
	private static void updateRevisoes(EntityManager em) {
		
		int pk = 3;
		Revisoes objRev = em.find(Revisoes.class, pk);
		
		if (objRev != null) {
			objRev.setDataRev(new Date());
			objRev.setValorFinal(550f);
			em.getTransaction().begin();
			em.merge(objRev); 
			em.getTransaction().commit();
			System.out.println("Objeto editado com sucesso!");

		}else {
			System.out.println("Objeto " + objRev + " não encontrado.");
		}
				
	}
}
