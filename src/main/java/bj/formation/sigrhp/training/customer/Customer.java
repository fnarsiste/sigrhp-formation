package bj.formation.sigrhp.training.customer;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "Customer")
@Table(name = "customers")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "customer_id_generator"
    )
    @SequenceGenerator(
            name = "customer_id_generator",
            sequenceName = "customer_id_seq",
            allocationSize = 1
    )
    @Column(name = "cust_id")
    private Long id;
    @Column(name = "cust_name")
    private String name;
    @Column(name = "cust_phone", unique = true, nullable = false, length = 10)
    private String phone;
    @Column(name = "cust_email", unique = true, nullable = false, length = 50)
    private String email;

    public Customer() {
    }

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
