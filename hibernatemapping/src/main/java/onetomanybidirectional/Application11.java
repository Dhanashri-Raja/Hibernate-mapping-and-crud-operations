package onetomanybidirectional;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name = "APPLICATION")
	public class Application11 {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String version;

	    @ManyToOne
	    @JoinColumn(name = "mobile_id")
	    private Mobile1 mobile;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getVersion() {
	        return version;
	    }

	    public void setVersion(String version) {
	        this.version = version;
	    }

	    public Mobile1 getMobile() {
	        return mobile;
	    }

	    public void setMobile(Mobile1 mobile) {
	        this.mobile = mobile;
	    }
	}