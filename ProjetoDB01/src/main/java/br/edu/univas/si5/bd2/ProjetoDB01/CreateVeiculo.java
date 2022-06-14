package br.edu.univas.si5.bd2.ProjetoDB01;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateVeiculo {

	public static void main(String[] args) {
		
		Veiculo veic = new Veiculo();
		veic.setProprietario("Mateus");
		veic.setSenha_prop("mat123");
		
		DetalheVeiculo detVeic = new DetalheVeiculo();
		detVeic.setModelo("Gol G4");
		detVeic.setMarca("Volkswagen");
		detVeic.setAno(2012);
		detVeic.setVeiculo(veic);
		
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(veic);
		em.persist(detVeic);
		em.getTransaction().commit();
		

	}

}
