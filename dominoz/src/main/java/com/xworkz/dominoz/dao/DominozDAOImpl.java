package com.xworkz.dominoz.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.dominoz.dto.DominozDTO;
import com.xworkz.singlefactory.SingleFactory;

public class DominozDAOImpl implements DominozDAO {

	@Override
	public void save(DominozDTO dominozdto) {
		System.out.println("Inside save method");
		Session session = null;

		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(dominozdto);
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
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}

	}

	@Override
	public void getPizza() {
		System.out.println("Inside get method");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			DominozDTO dominozDTO = session.load(DominozDTO.class, 2);
			System.out.println(dominozDTO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");

			}
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void updatePizza() {
		System.out.println("inside update method");

		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			DominozDTO dominozdto = session.get(DominozDTO.class, 10);
			// dominozdto.setPrice(250);
			dominozdto.setLocation("Mysuru");
			transaction = session.beginTransaction();
			// session.update(dominozdto);
			session.merge(dominozdto);
			transaction.commit();
			System.out.println("update is done");

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

		}

	}

	@Override
	public void deletePizzaId() {
		System.out.println("inside delete method");

		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			DominozDTO dominozdto = session.get(DominozDTO.class, 35);
			transaction = session.beginTransaction();
			session.remove(dominozdto);
			transaction.commit();
			System.out.println("record delete successfully");
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

			// SingleFactory.closeFactory();

		}
	}

	@Override
	public void getAllPizzaRecords() {
		System.out.println("Invoked all Dominoz records ");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			String hql = "from com.xworkz.dominoz.dto.DominozDTO";

			@SuppressWarnings("unchecked")
			Query<DominozDTO> query = session.createQuery(hql);
			List<DominozDTO> list = query.list();
			System.out.println(list);

			for (DominozDTO dominozdto : list) {
				System.out.println(dominozdto);
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
			// SingleFactory.closeFactory();

		}

	}

	@Override
	public void getPizzaNameById() {
		System.out.println("Invoked pizza name by location ");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			String hql = "select name from DominozDTO where pizzaId = 4 ";

			@SuppressWarnings("unchecked")
			Query<DominozDTO> query = session.createQuery(hql);
			List<DominozDTO> list = query.list();
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
