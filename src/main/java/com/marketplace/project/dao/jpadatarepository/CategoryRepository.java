package com.marketplace.project.dao.jpadatarepository;

import com.marketplace.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
