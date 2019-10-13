import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Retrive {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Emp emp =(Emp)session.get(Emp.class,2);
		System.out.println(emp.getEno()+"-"+emp.getEname()+"-"+emp.getSal());
		session.close();
		sessionFactory.close();
		
	}

}
