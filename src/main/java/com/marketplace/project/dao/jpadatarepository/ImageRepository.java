package com.marketplace.project.dao.jpadatarepository;

import com.marketplace.project.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
