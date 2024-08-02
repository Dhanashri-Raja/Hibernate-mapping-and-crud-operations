package hibernateinheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		  Session s=sf.openSession();
		    Transaction t= s.beginTransaction();
			Employee e=new Employee();
			e.setName("Dhanashri");
			s.save(e);
			PermanentEmployee pe=new PermanentEmployee();
			pe.setPid(101);
			pe.setPcost("10");
			s.save(pe);
			ContractEmployee ce=new ContractEmployee();
			ce.setCid(104);
			ce.setChr("8");
			s.save(ce);
		      t.commit();
	}

}
