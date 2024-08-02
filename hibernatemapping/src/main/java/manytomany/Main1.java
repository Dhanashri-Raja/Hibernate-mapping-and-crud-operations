package manytomany;
	    import java.util.HashSet;
		import java.util.Set;

		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.cfg.Configuration;

		public class Main1 {


			public static void main(String[] args) {
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session s = sf.openSession();
				Transaction t = s.beginTransaction();
				Student student1 = new Student("Logesh");
				Student student2 = new Student("Kumar");

				Course course1 = new Course("Math 101");
				Course course2 = new Course("History 102");


				student1.getCourses().add(course1);
				student1.getCourses().add(course2);

				student2.getCourses().add(course1);

				s.save(student1);
				s.save(student2);
				t.commit();

				sf.close();
			}

	}

