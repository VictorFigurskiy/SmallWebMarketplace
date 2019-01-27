package com.marketplace.project.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "city")
    private String city;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "last_name")
    private String last_name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seller", cascade = CascadeType.REFRESH)
    private List<Offer> offerForSale;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "buyer", cascade = CascadeType.REFRESH)
    private List<Offer> purchaseItems;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private List<Role> roles;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Offer> getOfferForSale() {
        return offerForSale;
    }

    public void setOfferForSale(List<Offer> offerForSale) {
        this.offerForSale = offerForSale;
    }

    public List<Offer> getPurchaseItems() {
        return purchaseItems;
    }

    public void setPurchaseItems(List<Offer> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public User(String city, String email, String first_name, String password, String phone, String last_name, List<Offer> offerForSale, List<Offer> purchaseItems, List<Role> roles) {
        this.city = city;
        this.email = email;
        this.first_name = first_name;
        this.password = password;
        this.phone = phone;
        this.last_name = last_name;
        this.offerForSale = offerForSale;
        this.purchaseItems = purchaseItems;
        this.roles = roles;
    }

    public User() {
    }
}
