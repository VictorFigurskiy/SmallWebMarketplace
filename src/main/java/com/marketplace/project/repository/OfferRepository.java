package com.marketplace.project.repository;

import com.marketplace.project.controllers.model.Offer;
import com.marketplace.project.controllers.model.User;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OfferRepository {

    // null if updated meal do not belong to userId
    Offer save(Offer offer, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Offer get(int id, int userId);

    // ORDERED dateTime desc
    List<Offer> getAll(int userId);

    default Offer getWithUser(int id, int userId) {
        throw new UnsupportedOperationException();
    }


}
