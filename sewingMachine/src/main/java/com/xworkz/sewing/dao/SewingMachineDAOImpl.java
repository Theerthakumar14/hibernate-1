package com.xworkz.sewing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.sewing.dto.SewingMachineDTO;
import com.xworkz.singlefactory.SingleFactory;

public class SewingMachineDAOImpl implements SewingMachineDAO {

	@Override
	public void save(SewingMachineDTO sewingmachinedto) {
		System.out.println("inside save method");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
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

		}
	}

	@Override
	public void getSewingMachineDetails() {
		System.out.println("Inside get method");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO SewingMachineDTO = session.get(SewingMachineDTO.class, 2);
			System.out.println(SewingMachineDTO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void updateSewingMachineNameandPrice() {
		System.out.println("Inside update method");
		Session session = null;
		// Transaction transaction = null;

		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			
			session = sessionFactory.openSession();
			System.out.println("session -------------------------------");
			SewingMachineDTO machineDTO = session.get(SewingMachineDTO.class, 1);
			
			machineDTO.setSewingId(machineDTO.getSewingId());
			machineDTO.setName("Elei");
			machineDTO.setPrice(100.0);
			session.beginTransaction();
			session.update(machineDTO);
			session.getTransaction().commit();
			System.out.println("updated successfully");

		} catch (Exception e) {
			// transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void deleteSewingMachineDetails() {
		System.out.println("Inside delete method");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO machineDTO = session.get(SewingMachineDTO.class, 3);
			transaction = session.beginTransaction();
			session.remove(machineDTO);
			transaction.commit();
			System.out.println("Delete is done");

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
			SingleFactory.closeFactory();

		}

	}

}
