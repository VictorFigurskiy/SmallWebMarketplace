package com.marketplace.project.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category")
    private String category;

    @OneToMany(mappedBy = "category")
    private List<Offer> offersForCatefory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Offer> getOffersForCatefory() {
        return offersForCatefory;
    }

    public void setOffersForCatefory(List<Offer> offersForCatefory) {
        this.offersForCatefory = offersForCatefory;
    }

    public Category(String category, List<Offer> offersForCatefory) {
        this.category = category;
        this.offersForCatefory = offersForCatefory;
    }

    public Category() {
    }
}
