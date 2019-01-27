package com.marketplace.project.dao;

import com.marketplace.project.entities.Offer;
import org.springframework.data.repository.CrudRepository;

public interface OfferRepository extends CrudRepository<Offer, Integer> {
}
