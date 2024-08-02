package onetoone;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
 @Id
 private int qid;
 private String qname;
 @OneToOne
 @JoinColumn (name= "aid") 
 private Answer ans;
 
 public int getQid() {
  return qid;
 }
 @Override
 public String toString() {
  return "Question [qid=" + qid + ", qname=" + qname + ", ans=" + ans + "]";
 }
 public void setQid(int qid) {
  this.qid = qid;
 }
 public String getQname() {
  return qname;
 }
 public void setQname(String qname) {
  this.qname = qname;
 }
 public Answer getAns() {
  return ans;
 }
 public void setAns(Answer ans) {
  this.ans = ans;
 }
 public Question() {
  
 }
}
	
