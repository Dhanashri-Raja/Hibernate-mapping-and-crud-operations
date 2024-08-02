package hibernateinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
  @DiscriminatorValue("PermanentEmployee")
public class PermanentEmployee extends Employee {
	int pid;
	String pcost;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcost() {
		return pcost;
	}
	public void setPcost(String pcost) {
		this.pcost = pcost;
	}
	
	
	
}

