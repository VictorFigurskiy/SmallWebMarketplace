package com.marketplace.project.dao;

import com.marketplace.project.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepositoryCustom extends UserRepository{

    @Query("SELECT u FROM User u where u.first_name = :name")
    List<User> getAllUsersWithName(
            @Param("name") String name);

    List<User> getAllByEmail( @Param("email") String email);

}
