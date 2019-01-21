package com.marketplace.project.services;


import com.marketplace.project.controllers.model.User;
import com.marketplace.project.repository.UserRepository;
import com.marketplace.project.to.UserTo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(int id) throws NotFoundException {
         repository.delete(id);
    }

    @Override
    public User get(int id) throws NotFoundException {
        return repository.get(id);
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return repository.getByEmail(email);
    }

    @Override
    public void update(User user) {
        repository.save(user);

    }

    @Override
    public void update(UserTo user) {
        //repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    /*@Override
    public void enable(int id, boolean enable) {

    }*/

    @Override
    public User getWithOffers(int id) {
        return repository.getWithOffers(id);
    }
}
