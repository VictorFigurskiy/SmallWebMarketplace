package com.marketplace.project.dao.jpadatarepository;

import com.marketplace.project.dao.custom.UserRepositoryCustom;
import com.marketplace.project.dao.custom.UserRepositoryImpl;
import com.marketplace.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom {


}
