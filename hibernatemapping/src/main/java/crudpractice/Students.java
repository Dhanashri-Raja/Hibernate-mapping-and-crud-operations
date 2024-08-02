package crudpractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Students {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator2")
    private int sid;
    private String sname;
    
 public int getSid() {
  return sid;
 }
 public void setSid(int sid) {
  this.sid = sid;
 }
 public String getSname() {
  return sname;
 }
 public void setSname(String sname) {
  this.sname = sname;
 }
 public Students(int sid, String sname) {
  super();
  this.sid = sid;
  this.sname = sname;
 }
 @Override
 public String toString() {
  return "Student [sid=" + sid + ", sname=" + sname + "]";
 }
 public Students() {
  
 }

}