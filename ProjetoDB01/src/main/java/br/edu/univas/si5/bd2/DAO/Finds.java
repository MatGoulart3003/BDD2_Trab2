package br.edu.univas.si5.bd2.DAO;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Finds {
	
	EntityManager em = HibernateUtil.getEntityManager();
	
	public void findVeic () {
		Veiculo objVeic = em.find(Veiculo.class, 2); //busca veiculo com pk 2
		DetalheVeiculo objDet = em.find(DetalheVeiculo.class, objVeic.getDetalheVeiculo());
		System.out.println("Veiculo: " + objVeic + "\n"
				+ "Detalhes:" + objDet);
		
	}
	public void findRevisao() {
		Revisoes objRev = em.find(Revisoes.class, 3); //busca revisão com pk 3
		System.out.println("Revisão: " + objRev + "\n\n\n");
	}
}
