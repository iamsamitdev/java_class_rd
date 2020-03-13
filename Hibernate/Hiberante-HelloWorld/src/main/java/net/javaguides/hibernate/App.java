package net.javaguides.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.entity.Product;
import net.javaguides.hibernate.util.HibernateUtil;

public class App {
	public static void main(String[] args) {

		Product student = new Product("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
		Product student1 = new Product("John", "Cena", "john@javaguides.com");
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.save(student);
			session.save(student1);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			List<Product> products = session.createQuery("from products", Product.class).list();
			products.forEach(s -> {
				System.out.println("Print student email id : " + s.getEmail());
			});
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
