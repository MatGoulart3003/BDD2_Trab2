package br.edu.univas.si5.bd2.ProjetoTrabBDD2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateVeiculo {

	public static void main(String[] args) {
		
		Veiculo veic = new Veiculo();
		veic.setProprietario("fabricio");
		veic.setSenha_prop("fabricio23");
		
		DetalheVeiculo detVeic = new DetalheVeiculo();
		detVeic.setModelo("Fusca");
		detVeic.setMarca("VW");
		detVeic.setAno(1970);
		detVeic.setVeiculo(veic);
		
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(veic);
		em.persist(detVeic);
		em.getTransaction().commit();
		

	}

}
