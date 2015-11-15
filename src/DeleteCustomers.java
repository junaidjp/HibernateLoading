import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import com.bank.entity.Customer;
import com.training.hibernate.HibernateSessionFactory;

public class DeleteCustomers {

	public static void main(String args[]) {

		Session session = null;
		try {
			SessionFactory sessionFactory = HibernateSessionFactory
					.getSessionFactory();
			session = sessionFactory.openSession();

			session.beginTransaction();
			Customer customerOne = (Customer) session.get(Customer.class, 1);
			System.out.println(customerOne.getName());
			session.delete(customerOne);
			session.getTransaction().commit();
			
			
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

		 finally { 
			 session.close();
		 }
	}

}
