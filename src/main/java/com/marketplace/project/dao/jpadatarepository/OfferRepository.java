package com.marketplace.project.dao.jpadatarepository;

import com.marketplace.project.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Integer> {
}
