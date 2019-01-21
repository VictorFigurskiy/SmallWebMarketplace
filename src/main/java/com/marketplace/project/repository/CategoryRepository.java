package com.marketplace.project.repository;

import com.marketplace.project.controllers.model.Category;
import com.marketplace.project.controllers.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository {

    // null if updated meal do not belong to userId
    Category save(Category category, int offerId);

    // false if meal do not belong to userId
    boolean delete(int id, int offerId);

    // null if meal do not belong to userId
    Category get(int id, int offerId);

    // ORDERED dateTime desc
    List<Category> getAll(int offerId);


    default Category getWithOffer(int id, int offerId) {
        throw new UnsupportedOperationException();
    }

}
