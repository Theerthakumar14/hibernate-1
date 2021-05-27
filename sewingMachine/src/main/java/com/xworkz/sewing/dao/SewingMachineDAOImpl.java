package com.xworkz.sewing.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

	@Override
	public void getallSewingMachineRecords() {
		System.out.println("Invoked all Sewing machine records ");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			String hql = "from com.xworkz.sewing.dto.SewingMachineDTO";
			@SuppressWarnings("unchecked")
			Query<SewingMachineDTO> query = session.createQuery(hql);
			List<SewingMachineDTO> list = query.list();
			System.out.println(list);
			System.out.println(list);
			for (SewingMachineDTO sewingMachineDTO : list) {
				System.out.println(sewingMachineDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();

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

	@Override
	public void getSewingMachineColourById() {
		System.out.println("Invoked sewing machine color by id ");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			String hql="select colour from SewingMachineDTO where sewingId=2";
		//	String hql = "select sewing.colour,sewing.price from com.xworkz.sewing.dto.SewingMachineDTO AS sewing where sewingId=4";
			
			@SuppressWarnings("unchecked")
			Query<SewingMachineDTO> query = session.createQuery(hql);
			List<SewingMachineDTO> list = query.list();
			System.out.println(list);

		} catch (Exception e) {
			e.printStackTrace();

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
