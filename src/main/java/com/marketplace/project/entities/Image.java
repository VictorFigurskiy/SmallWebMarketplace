package com.marketplace.project.entities;


import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @ManyToOne
    private Offer offer_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Offer getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(Offer offer_id) {
        this.offer_id = offer_id;
    }


    public Image(String name, String path, Offer offer_id) {
        this.name = name;
        this.path = path;
        this.offer_id = offer_id;
    }

    public Image() {
    }
}
