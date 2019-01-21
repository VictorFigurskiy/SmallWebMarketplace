package com.marketplace.project.repository;

import com.marketplace.project.controllers.model.Image;
import com.marketplace.project.controllers.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRepository{

    // null if updated meal do not belong to userId
    Image save(Image image, int offerId);

    // false if meal do not belong to userId
    boolean delete(int id, int offerId);

    // null if meal do not belong to userId
    Image get(int id, int offerId);

    // ORDERED dateTime desc
    List<Image> getAll(int offerId);


    default Image getWithOffer(int id, int offerId) {
        throw new UnsupportedOperationException();
    }

}
