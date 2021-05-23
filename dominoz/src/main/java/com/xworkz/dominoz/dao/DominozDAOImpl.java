package com.xworkz.dominoz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.dominoz.dto.DominozDTO;

public class DominozDAOImpl implements DominozDAO {

	@Override
	public void save(DominozDTO dominozdto) {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(dominozdto);
			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is closed");
			} else {
				System.out.println("sessionFactory is not closed");
			}
		}

	}

	@Override
	public void getPizza() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			DominozDTO dominozDTO = session.get(DominozDTO.class, 45);
			System.out.println(dominozDTO);
		} 
		catch (Exception e) {
				e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {

			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is closed");
			} else {
				System.out.println("sessionFactory is not closed");
			}

		}

	}

}
