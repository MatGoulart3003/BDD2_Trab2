package br.edu.univas.si5.bd2.DAO;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Updates {
	
	
		
	public void updateDetalheVeiculo(){
		
		EntityManager em = HibernateUtil.getEntityManager();
		em = HibernateUtil.getEntityManager();		
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
	
	public void updateVeiculo() {
		
		EntityManager em = HibernateUtil.getEntityManager();
		em = HibernateUtil.getEntityManager();		
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
	
	public void updateRevisoes() {
		
		EntityManager em = HibernateUtil.getEntityManager();
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
