package br.edu.univas.si5.bd2.DAO;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateVeiculo {
	
	Scanner scan = new Scanner(System.in);
	
	public void createVeic(){
	
	
		Veiculo veic = new Veiculo();
		System.out.println("Digite o Proprietário");
		veic.setProprietario(scan.nextLine());
		System.out.println("Digite a senha do Proprietário");
		veic.setSenha_prop(scan.nextLine());
	
		DetalheVeiculo detVeic = new DetalheVeiculo();
		System.out.println("Digite o Modelo");
		detVeic.setModelo(scan.nextLine());
		System.out.println("Digite a Marca");	
		detVeic.setMarca(scan.nextLine());
		System.out.println("Digite o Ano");	
		detVeic.setAno(scan.nextInt());	
		scan.nextLine();
		detVeic.setVeiculo(veic);
	
		EntityManager em;
		em = HibernateUtil.getEntityManager();
	
		em.getTransaction().begin();
		em.persist(veic);
		em.persist(detVeic);
		em.getTransaction().commit();

	}

}
