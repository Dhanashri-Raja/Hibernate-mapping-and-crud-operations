package hibernateinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
    @DiscriminatorValue("ContractEmployee")

public class ContractEmployee extends Employee {
	int cid;
	String chr;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getChr() {
		return chr;
	}
	public void setChr(String chr) {
		this.chr = chr;
	}
	
}
