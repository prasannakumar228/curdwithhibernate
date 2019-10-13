import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.setEno(2);
		
		

			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.delete(emp);
			
			transaction.commit();
			session.close();
			sessionFactory.close();
		
		
		
	}

}
