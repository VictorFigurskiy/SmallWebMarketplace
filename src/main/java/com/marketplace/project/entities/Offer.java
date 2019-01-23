package com.marketplace.project.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TITLE", length = 500)
    private String title;
    @Column(name = "PRICE", nullable = false, scale = 2)
    private BigDecimal price;
    @Column(name = "`DESCRIPTION`", length = 1000)
    private String offerDescription;
    @Column(name = "`CONDITION`", length = 30)
    private String condition;
    @Column(name = "`VISIBLE`", length = 30)
    private Boolean isVisible;
    @Column(name = "`CREATION_TIME`")
    private LocalDateTime creationTimeAndDate;

    @ManyToOne
    private Category category;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "offer", cascade = {CascadeType.REMOVE, CascadeType.REFRESH}) // TODO
    private List<Image> image;

    @ManyToOne
    private User seller;

    @ManyToOne
    private User buyer;

    public Offer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public LocalDateTime getCreationTimeAndDate() {
        return creationTimeAndDate;
    }

    public void setCreationTimeAndDate(LocalDateTime creationTimeAndDate) {
        this.creationTimeAndDate = creationTimeAndDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
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
}
