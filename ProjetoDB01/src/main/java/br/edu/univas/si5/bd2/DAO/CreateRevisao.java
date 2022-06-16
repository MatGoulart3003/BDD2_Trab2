package br.edu.univas.si5.bd2.DAO;

import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateRevisao {

	public void createRevisao() {
		
		Scanner scan = new Scanner(System.in);
		EntityManager em = HibernateUtil.getEntityManager();
	
		System.out.println("Digite a chave primária do Veiculo correspondente à revisão:");
		Veiculo veic = em.find(Veiculo.class, scan.nextInt());
		scan.nextLine();
		if(veic == null) {
			System.out.println(veic + "é null");
			scan.close();
			return;
		}
		
		Revisoes rev = new Revisoes();
		rev.setDataRev(new Date());
		System.out.println("Digite o valor da revisão:");
		rev.setValorFinal(scan.nextFloat());
		scan.nextLine();
		rev.setVeiculo(veic);
	
		em.getTransaction().begin();
		em.persist(rev);
		em.getTransaction().commit();
	
		System.out.println("Revisão " + rev + " cadastrada com sucesso" );
		scan.close();
	}

}
