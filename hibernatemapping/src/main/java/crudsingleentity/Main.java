package crudsingleentity;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Order;

import org.hibernate.criterion.Projections;

import org.hibernate.criterion.Restrictions;



public class Main {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

//        Book b= new Book("saravana",459);

//        s.save(b);

//        

//        Book b1= new Book();

//        b1.setBname("HTML");

//        b1.setBprice(450);

//        s.save(b1);

//        t.commit();

//        

//        Book b1= new Book();

//        b1.setBname("sree");

//        b1.setBprice(3000);

//        s.save(b1);

//        t.commit();

//       Book b= new Book();

//        b.setBid(3);

//        s.delete(b);

//        t.commit();

//        

//        Book b= new Book();

//        b.setBid(1);

//        b.setBname("angular");

//        b.setBprice(419);

//        s.update(b);

//        t.commit();

		Query q = s.createQuery("from Book");

		List<Book> li = q.list();

		for (Book bk : li)

		{

			System.out.println(bk);

		}

//        Query q1 = s.createQuery("SELECT COUNT(*) FROM Book");

//        long count=(long) q1.uniqueResult();

//        System.out.println("No of  books "+count);

//        Query q2 = s.createQuery("SELECT max(bprice) FROM Book");

//        int mprice= (int) q2.uniqueResult();

//        System.out.println("book price  "+mprice);     

//       

//      Query q3=s.createQuery("select bname,count(*) from Book  group by bname");

//      List<Object[]> bookGroups = q3.list();

//      System.out.println("Bookwise count:");

//      for (Object[] group : bookGroups) {

//          System.out.println("Bookname: " + group[0] + ", Count: " + group[1]);

//      }

//      Query q1=s.createQuery("select bname,count() from Book  group by bname having count()>1");

//     List<Object[]> bookGroups = q1.list();

//     System.out.println("Bookwise count:");

//        sf.close();

//        for (Object[] group : bookGroups) {

//        System.out.println("Bookname: " + group[0] + ", Count: " + group[1]);

//        	}

//      Query q1=s.createQuery("select bid from Book order by bid desc ");

//      List<String> bookGroups = q1.list();

//      System.out.println("Bookname: " );

//      for (String group : bookGroups) {

//          System.out.println( group);

//      }

//      Query q1=s.createQuery("select bid from Book order by bid desc ");

//      List<Integer> bookGroups = q1.list();

//      System.out.println("Bookname: " );

//      for (Integer group : bookGroups) {

//          System.out.println( group);

//      }

//      Query q1=s.createQuery("select bid,bname from Book order by bid desc ");

//      List<Object[]> bookGroups = q1.list();

//      System.out.println("Bookname: " );

//      for (Object[] group : bookGroups) {

//          System.out.println( group[0]+" "+group[1]);

//      }

//      Query query = s.getNamedQuery("findBookByName");     

//    query.setParameter("name","rajan");     

//    Book b= (Book) query.uniqueResult();

//    

//    

//     System.out.println(b);

//    Query query = s.getNamedQuery("findBookByPrice");     

//    query.setParameter("price",8000);     

//    Book b= (Book) query.uniqueResult();

//    List<Book> bookGroups1 = query.list();

//    for(Book b1: bookGroups1) {

//     System.out.println(b1);

//    }  

//  Query query = s.getNamedQuery("findBookByPriceRange");     

//  query.setParameter("minPrice",399); 

//  query.setParameter("maxPrice",449);

//  Book b= (Book) query.uniqueResult();

//  List<Book> bookGroups1 = query.list();

//  for(Book b1: bookGroups1) {

//   System.out.println(b1);

//  }

//Query query = s.getNamedQuery("findBookByBookLike");     

//  List<Book> bookGroups1 = query.list();

//  for(Book b1: bookGroups1) {

//   System.out.println(b1);

//  }

//        Criteria criteria = s.createCriteria(Book.class);

//        List<Book> empList = criteria.list();

//        for(Book emp : empList){

//            System.out.println(emp.getBid()+";"+ emp.getBname());

//        }

//        Criteria criteria = s.createCriteria(Book.class);

//        criteria.addOrder(Order.desc("bname"));

//        List<Book> empList = criteria.list();

//        for(Book emp : empList){

//            System.out.println(emp.getBid()+";"+ emp.getBname());

//        }

//        Criteria c=s.createCriteria(Book.class);  

//        c.add(Restrictions.gt("bprice",500));

//        List<Book> empList = c.list();

//         for(Book emp : empList){

//         System.out.println(emp.getBid()+";"+ emp.getBname());

		// }

//      Criteria criteria = s.createCriteria(Book.class);

//      @SuppressWarnings("unchecked")

//List<Book> empList = criteria.list();

//      for(Book emp : empList){

//          System.out.println(emp.getBid()+";"+emp.getBname());

//      }

//      Criteria c=s.createCriteria(Book.class);  

//      c.addOrder(Order.asc("bname"));

//      List<Book> empList = c.list();

//      for(Book emp : empList){

//          System.out.println(emp.getBid()+";"+emp.getBname());

//      }

//      Criteria c=s.createCriteria(Book.class);  

//      c.add(Restrictions.gt("bprice",300));

//      List<Book> empList = c.list();

//    for(Book emp : empList){

//        System.out.println(emp.getBid()+";"+emp.getBname());

//    }

//long sumSalary = (long) s.createCriteria(Book.class)

//           .setProjection(Projections.sum("bprice"))

//           .uniqueResult();

//       System.out.println("Sum of Salaries="+sumSalary);

		long sumSalary = (Long) s.createCriteria(Book.class).setProjection(Projections.count("bid")).uniqueResult();
		System.out.println("Sum of Salaries=" + sumSalary);

//double sumSalary = (double) s.createCriteria(Book.class)

//           .setProjection(Projections.avg("bprice"))

//           .uniqueResult();

//       System.out.println("Sum of Salaries="+sumSalary);

//Criteria c=s.createCriteria(Book.class);  

//c.setFirstResult(0);  

//c.setMaxResults(2);  

//List<Book> empList = c.list();

//    for(Book emp : empList){

//        System.out.println(emp.getBid()+" "+emp.getBname()+" "+emp.getBprice());

//    }

	}

}
