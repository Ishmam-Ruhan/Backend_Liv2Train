package com.ishmamruhan.Liv2Train.Models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "training_centers")
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "center_names")
    @Size(min = 3, max = 39)               //Setting Condition of name for validation
    @NotEmpty
    private String name;

    @NotEmpty
    @Column(name = "center_code")
    @Pattern(regexp = "[a-zA-Z0-9_]{12}", message = "Code length must be equal to 12 (Alphanumeric)")        // Setting
    private String code;                                                                                     // up code pattern: 12 digit only alphanumeric

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;                                     // Setting up address as object and make one to one relationship

    @Column(name = "max_capacity")
    private Long capacity;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(
            name = "center_course",
            joinColumns = {
                    @JoinColumn(name = "center_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id")
            }
    )
    private List<Course> courses=new ArrayList<>();             // Many Training center can have one course, similarly many course can have in many training centers

    @Column(name = "email", nullable = true)               // Email field can nullable. and If present then patterns will be checked
    @Email(regexp = "^(.+)@(.+)$")                        // Validation the email
    private String email;

    @Pattern(regexp = "^(?:\\+88|88)?(01[3-9]\\d{8})$",message = "Must be a valid Phone number of Bangladesh.")   // Phone number validation will be happend here
    private String phone;

    @Transient                                          // Make the following property transient, so that ORM can prevent this field from creating column
    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    private String created_at = simpleDateFormat.format(new Date());

    public TrainingCenter() {
    }

    public TrainingCenter(String name, String code, Address address, Long capacity, List<Course> courses, String email, String phone) {
        this.name = name;
        this.code = code;
        this.address = address;
        this.capacity = capacity;
        this.courses = courses;
        this.email = email;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreated_at() {
        return created_at;
    }
}
