package br.edu.univas.si5.bd2.DAO;

import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalheVeiculo;
import br.edu.univas.si5.bd2.entities.Revisoes;
import br.edu.univas.si5.bd2.entities.Veiculo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Updates {
	
	Scanner scan;	
	
	public void updateDetalheVeiculo(){
		scan = new Scanner (System.in);
		
		EntityManager em = HibernateUtil.getEntityManager();
		em = HibernateUtil.getEntityManager();		

		System.out.println("Digite a chave do veículo à ser editado:");
		DetalheVeiculo objDet = em.find(DetalheVeiculo.class, scan.nextLine());
		
		if (objDet != null) {
			
			System.out.println("Editando Detalhes do Veículo: \n");
						
			System.out.println("Digite o ano:");
			objDet.setAno(scan.nextInt());
			scan.nextLine();
			
			System.out.println("Digite a marca:");
			objDet.setMarca(scan.nextLine());
			
			em.getTransaction().begin();
			em.merge(objDet); 
			em.getTransaction().commit();
			System.out.println("Objeto editado com sucesso!");
			
		}else {
			System.out.println("Objeto " + objDet + " não encontrado.");
		}
		
	}
	
	public void updateVeiculo() {
		scan = new Scanner (System.in);
		
		EntityManager em = HibernateUtil.getEntityManager();
		em = HibernateUtil.getEntityManager();		
		
		System.out.println("Digite a chave do veículo à ser editado:");
		Veiculo objVeic = em.find(Veiculo.class, scan.nextInt());
		scan.nextLine();
		
		if (objVeic != null) {
			
			System.out.println("Editando Prorietario do Veiculo: \n");
			System.out.println("Digite o nome do Proprietário:");
			objVeic.setProprietario(scan.nextLine());
			
			System.out.println("Digite a senha do Proprietário:");
			objVeic.setSenha_prop(scan.nextLine());
			
					
			em.getTransaction().begin();
			em.merge(objVeic); 
			em.getTransaction().commit();
			System.out.println("Objeto editado com sucesso!");

		}else {
			System.out.println("Objeto " + objVeic + " não encontrado.");
		}
		
	}
	
	public void updateRevisoes() {		
		scan = new Scanner (System.in);
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		System.out.println("Digite a chave da revisão à ser editada:");
		Revisoes objRev = em.find(Revisoes.class, scan.nextInt());
		scan.nextLine();
		
		if (objRev != null) {
			Date date = new Date();
			objRev.setDataRev(date);
			
			System.out.println("Editando revisão: \n");
			System.out.println("Digite o novo valor da revisão: ");
			objRev.setValorFinal(scan.nextFloat());
			scan.nextLine();
			
			em.getTransaction().begin();
			em.merge(objRev); 
			em.getTransaction().commit();
			System.out.println("Objeto editado na data " + date + " com sucesso!");

		}else {
			System.out.println("Objeto " + objRev + " não encontrado.");
		}
			
	}
}
