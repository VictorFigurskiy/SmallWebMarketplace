package com.marketplace.project.to;


import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.SafeHtml;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserTo extends BaseTo implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotBlank
    @Size(min = 2, max = 100)
    @SafeHtml
    private String city;


    @Email
    @NotBlank
    @Size(max = 100)
    @SafeHtml
    private String email;


    @NotBlank
    @Size(min = 2, max = 100)
    @SafeHtml
    private String name;


    @Size(min = 5, max = 32, message = "length must between 5 and 32 characters")
    private String password;

    @Size(min = 13, max = 13, message = "length must between +380xxxxxxxxx characters")
    private String phone;


    @NotBlank
    @Size(min = 5, max = 30)
    @SafeHtml
    private String lastName;

    public UserTo(Integer id, String city, String email, String name, String password, String phone, String  lastName ) {
        super(id);
        this.city = city;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.lastName = lastName;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserTo{" +
                "city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
