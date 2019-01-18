package com.marketplace.project.services;


import com.marketplace.project.controllers.model.User;
import com.marketplace.project.to.UserTo;
import javassist.NotFoundException;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void update(UserTo user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void enable(int id, boolean enable) {

    }

    @Override
    public User getWithMeals(int id) {
        return null;
    }
}
