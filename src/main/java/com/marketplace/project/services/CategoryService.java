package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Category;
import javassist.NotFoundException;

import java.util.List;

public interface CategoryService {

    Category get(int id, int offerId) throws NotFoundException;

    void delete(int id, int offerId) throws NotFoundException;

    List<Category> getAll(int offerId);

    Category update(Category category, int offerId) throws NotFoundException;

    Category create(Category category, int offerId);

    Category getWithOffer(int id, int userId);

}
