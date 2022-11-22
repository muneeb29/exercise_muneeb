package com.aero.aeroparker_muneeb.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customers")
public class Customers {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    @Column(name = "registered", nullable = false)
    private Date registered;
    @Column(name = "email_address", unique=true, nullable = false)
    private String email_address;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "first_name", nullable = false)
    private String first_name;
    @Column(name ="last_name", nullable = false)
    private String last_name;
    @Column(name ="address_line_1", nullable = false)
    private String address_line_1;
    @Column(name = "address_line_2")
    private String address_line_2;
    @Column(name ="city")
    private String city;
    @Column(name = "postcode", nullable = false)
    private String postcode;
    @Column(name = "phone_number")
    private String phone_number;

    public void setId(int id) {
        this.id = id;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }
    @PrePersist
    private void reg(){
        registered = new Date();
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }
}
