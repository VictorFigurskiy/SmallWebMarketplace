package com.marketplace.project.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class Role {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_type")
    private String role_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_type() {
        return role_type;
    }

    public void setRole_type(String role_type) {
        this.role_type = role_type;
    }

    public Role(String role_type) {
        this.role_type = role_type;
    }

    public Role() {
    }
}
