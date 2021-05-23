package com.xworkz.sewing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.sewing.dto.SewingMachineDTO;

public class SewingMachineDAOImpl implements SewingMachineDAO {

	@Override
	public void save(SewingMachineDTO sewingmachinedto) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure("sewingmachine.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(sewingmachinedto);
			session.getTransaction().commit();

		} catch (Exception e) {
			// session.getTransaction().rollback();
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
				System.out.println("session factory is closed");
			} else {
				System.out.println("session factory is not closed");

			}

		}
	}

	@Override
	public void getSewingMachineDetails() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure("sewingmachine.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO SewingMachineDTO = session.get(SewingMachineDTO.class, 2);
			System.out.println(SewingMachineDTO);
			// System.out.println(dominozDTO);
		} catch (Exception e) {
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
