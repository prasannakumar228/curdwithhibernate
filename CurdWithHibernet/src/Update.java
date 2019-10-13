import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {


			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Emp emp = session.get(Emp.class,2);
			System.out.println(emp.getEno()+"-"+emp.getEname()+"-"+emp.getSal());
			emp.setSal(40000);
			session.update(emp);
			transaction.commit();
			session.close();
			sessionFactory.close();
			
	}

}
