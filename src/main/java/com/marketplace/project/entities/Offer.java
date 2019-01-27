package com.marketplace.project.entities;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "condition")
    private String condition;

    @Column(name = "creation_time")
    private Date creation_time;

    @Column(name = "visible")
    private boolean visible;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "title")
    private String title;

    @ManyToOne
    private User seller;

    @ManyToOne
    private User buyer;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "offer_id")
    private List<Image> images;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Offer(String condition, Date creation_time, boolean visible, String description, BigDecimal price, String title, User seller, User buyer, Category category, List<Image> images) {
        this.condition = condition;
        this.creation_time = creation_time;
        this.visible = visible;
        this.description = description;
        this.price = price;
        this.title = title;
        this.seller = seller;
        this.buyer = buyer;
        this.category = category;
        this.images = images;
    }

    public Offer() {
    }
}

