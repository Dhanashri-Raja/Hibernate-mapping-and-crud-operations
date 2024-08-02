package onetoone;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main_1 {

 public static void main(String[] args) {
  SessionFactory sf= new Configuration().configure().buildSessionFactory();
  Session s=sf.openSession();
  Transaction t= s.beginTransaction();
  Answer a= new Answer();
  a.setId(101);
  a.setName("oops");
  Answer a1= new Answer(102, "HTML");
  s.save(a);
  s.save(a1);
  Question q= new Question();
  q.setQid(1);
  q.setQname("java");
  q.setAns(a);
  s.save(q); 
  Question q1= new Question();
  q1.setQid(2);
  q1.setQname("web page");
  q1.setAns(a1);
  s.save(q1);
  t.commit();
  Query q11=s.createQuery("from Question");
  List<Question> li=q11.list();
  for(Question bk:li)
  {
      System.out.println(bk);
  }
  Query q12=s.createQuery("from Answer");
  List<Answer> lis=q12.list();
  for(Answer bk:lis)
  {
      System.out.println(bk);
  }
 }

}


