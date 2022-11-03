package com.xworkz.krawardeesrepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.krawardeesdto.KrAwardeesDTO;

public class KrAwardeesRepImpl implements KrAwardeesRepository {
	
//	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
//	EntityManager manager = null;

//	@Override
//	public void save(KrAwardeesDTO dto) {
//		System.out.println("Running Save Method Successful");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.persist(dto);
//		transaction.commit();
//	}
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
	EntityManager manager =null;
	
	@Override
	public boolean save(KrAwardeesDTO dto) {
		try {
			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			System.out.println("created");
			manager.persist(dto);
			transaction.commit();
			
		} catch (PersistenceException e) {
			e.printStackTrace();
	}finally {
			manager.close();
			
			
		}
		return true;
	}


}

