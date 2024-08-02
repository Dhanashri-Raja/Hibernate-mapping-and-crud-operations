package onetomanyuni;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

			public static void main(String[] args) {
				SessionFactory sf= new Configuration().configure().buildSessionFactory();
				Session s=sf.openSession();
				Transaction t= s.beginTransaction();

			        Mobile mobile = new Mobile();
			        mobile.setBrand("IQOO");
			        mobile.setModel("Z6Lite");
			        s.save(mobile);
			        
			        Application app1 = new Application();
			        app1.setName("Utube");
			        app1.setVersion("2.21.11.17");
			        app1.setMobile(mobile);
			       s.save(app1);

			        Application app2 = new Application();
			        app2.setName("SnapChat");
			        app2.setVersion("185.0.0.30.120");
			        app2.setMobile(mobile);
			        s.save(app2);
			        
			        Set<Application> applications = new HashSet<Application>();
			        applications.add(app1);
			        applications.add(app2);

			        mobile.setApplications(applications);

			        t.commit();
			        sf.close();
			       
			    }
			
			}

