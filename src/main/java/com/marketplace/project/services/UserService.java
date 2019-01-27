package com.marketplace.project.services;

import com.marketplace.project.dao.UserRepositoryCustom;
import com.marketplace.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepositoryCustom userRepositoryCustom;

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    public UserService(UserRepositoryCustom userRepositoryCustom) {
        this.userRepositoryCustom = userRepositoryCustom;
    }

    public void save(User user){
        userRepositoryCustom.save(user);
    }

    public Iterable<User> findAll(){
        return userRepositoryCustom.findAll();
    }

    public List<User> getAllUsersByName(String name)
    {
        return userRepositoryCustom.getAllUsersWithName(name);
    }

    public List<User> getAllByEmail(String email) {
        return userRepositoryCustom.getAllByEmail(email);
    }
}
