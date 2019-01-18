package com.marketplace.project.services;

import com.marketplace.project.controllers.model.User;
import com.marketplace.project.to.UserTo;
import javassist.NotFoundException;

import java.util.List;

public interface UserService {

    User create(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    void update(User user);

    void update(UserTo user);

    List<User> getAll();

    void enable(int id, boolean enable);

    User getWithMeals(int id);
}
