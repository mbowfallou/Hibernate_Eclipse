package com.groupeisi.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.groupeisi.entities.User;

public class UserImpl implements IUser{

	@Override
	public int saisie(User user) {
		
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.persist(user);
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
