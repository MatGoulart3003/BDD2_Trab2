package br.edu.univas.si5.bd2.DAO;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateRevisao {

	public void createRevisao() {
		
		EntityManager em = HibernateUtil.getEntityManager();
	
		Veiculo veic = em.find(Veiculo.class, 7);
		if(veic == null) {
			System.out.println(veic + "é null");
			return;
		}
		
		Revisoes rev = new Revisoes();
		rev.setDataRev(new Date());
		rev.setValorFinal(9000.50f);
		rev.setVeiculo(veic);
	
		em.getTransaction().begin();
		em.persist(rev);
		em.getTransaction().commit();
	
		System.out.println("Revisão " + rev + " cadastrada com sucesso" );
	}

}
