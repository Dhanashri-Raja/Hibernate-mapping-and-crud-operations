package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
 @Id
private int id;
private String name;
public int getId() {
 return id;
}
public void setId(int id) {
 this.id = id;
}
public String getName() {
 return name;
}
public void setName(String name) {
 this.name = name;
}
public Answer(int id, String name) {
 super();
 this.id = id;
 this.name = name;
}

@Override
public String toString() {
 return "Answer [id=" + id + ", name=" + name + "]";
}
public Answer() {
 
}

}
