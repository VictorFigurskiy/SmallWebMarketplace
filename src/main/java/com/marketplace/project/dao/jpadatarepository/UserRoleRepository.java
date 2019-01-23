package com.marketplace.project.dao.jpadatarepository;

import com.marketplace.project.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
