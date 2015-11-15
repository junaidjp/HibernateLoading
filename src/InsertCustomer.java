import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.bank.entity.Customer;
import com.training.hibernate.HibernateSessionFactory;


public class InsertCustomer {
	
	

	public static void main(String args[]) {

		Session session = null;
		try {
			SessionFactory sessionFactory = HibernateSessionFactory
					.getSessionFactory();
			session = sessionFactory.openSession();

			session.beginTransaction();
			
			Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setName("Iftikar Ali");
			customer.setPhone("2147657777");
			customer.setSsn("111112222");
			session.save(customer);
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
