package crudpractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {
 public static void main(String[]args) {
  SessionFactory sf= new Configuration().configure().buildSessionFactory();
  Session s=sf.openSession();
        Transaction t= s.beginTransaction();
        Students b= new Students(2,"Dhanashri");
        s.save(b);
      
      Students b1= new Students();
      b1.setSname("rajan");
      b1.setSid(3);
      s.save(b1);
      t.commit();
      
//       Student b1=new Student();
//      b1.setSid(2);
//      s.delete(b1);
//      t.commit();
   }

}