package crudsingleentity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.NamedQueries;

import javax.persistence.NamedQuery;

@NamedQueries(   

	    {   

	        @NamedQuery(   

	        name = "findBookByName",   

	        query = "from Book e where e.bname =:name"   

	        )   

	        ,

	        @NamedQuery(   

	    	        name = "findBookByPrice",   

	    	        query = "from Book e where e.bprice = :price"   

	    	        )  

	        ,

	        @NamedQuery( name = "findBookByPriceRange", 

	        	         query = "SELECT p FROM Book p WHERE p.bprice >= :minPrice AND p.bprice <= :maxPrice")

	        	         ,

	        @NamedQuery( name = "findBookByBookLike", 

	        	         query = "SELECT p FROM Book p WHERE p.bname like's%' ")

	        	     }

	        	       

	        	 )

	    

	

@Entity



public class Book {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int bid;

    private String bname;

    private int bprice;

	public int getBid() {

		return bid;

	}



	public void setBid(int bid) {

		this.bid = bid;

	}



	public String getBname() {

		return bname;

	}

	public void setBname(String bname) {

		this.bname = bname;

	}

	public int getBprice() {

		return bprice;

	}

	public void setBprice(int bprice) {

		this.bprice = bprice;

	}

	public Book( String bname, int bprice) {

		super();

		

		this.bname = bname;

		this.bprice = bprice;

	}

	

	@Override

	public String toString() {

		return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";

	}



	public Book() {

		

	}

    

}