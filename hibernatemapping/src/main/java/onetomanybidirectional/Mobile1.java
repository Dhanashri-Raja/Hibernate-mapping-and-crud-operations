package onetomanybidirectional;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "MOBILE")
public class Mobile1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;

    @OneToMany(mappedBy = "mobile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Application11> applications;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<Application11> getApplications() {
        return applications;
    }

    public void setApplications(Set<Application11> applications) {
        this.applications = applications;
    }
}
