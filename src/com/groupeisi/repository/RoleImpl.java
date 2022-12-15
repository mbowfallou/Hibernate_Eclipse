package com.groupeisi.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.groupeisi.entities.Role;

public class RoleImpl implements IRole{

	@Override
	public int saisie(Role role) {
		
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			session.persist(role);
			
			transaction.commit();
			
			return 1;
		} 
		catch (Exception e) 
		{
			if(transaction != null)
				transaction.rollback();
			
			e.printStackTrace();
			
			return 0;
		}
		
	}

}
