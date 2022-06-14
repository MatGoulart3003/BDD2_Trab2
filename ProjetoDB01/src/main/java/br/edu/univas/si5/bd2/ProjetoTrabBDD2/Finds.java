package br.edu.univas.si5.bd2.ProjetoTrabBDD2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Finds {
	
	public static void main (String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();
	
		Veiculo objVeic = em.find(Veiculo.class, 2); //busca veiculo com pk 2
		System.out.println("Detalhes do véiculo : " + objVeic + "\n\n\n");
		
		Revisoes objRev = em.find(Revisoes.class, 3); //busca revisão com pk 3
		System.out.println("Revisão: " + objRev + "\n\n\n");

	}
}
