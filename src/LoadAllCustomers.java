import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import com.bank.entity.Bank;
import com.bank.entity.Customer;
import com.training.hibernate.HibernateSessionFactory;


public class LoadAllCustomers {
	
	
	public static void main(String args[]) { 
		
		 Session session = null;
			try {
				SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();
			      session =sessionFactory.openSession();
			      Query result = session.createQuery("from Customer");
			          List<Customer>  customerList = result.list();
			         for (Customer customer : customerList) { 
			        	 System.out.println(customer.getCustomerId());
			        	 System.out.println(customer.getName());
			        	 System.out.println(customer.getPhone());
			        	 System.out.println(customer.getSsn());
			         }
			         
			    
			      
			      
			      
			} 
			
			catch(Exception ex) { 
				ex.printStackTrace();
			}
		
		
	}

}
