package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Category;
import javassist.NotFoundException;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public Category get(int id, int offerId) throws NotFoundException {
        return null;
    }

    @Override
    public void delete(int id, int offerId) throws NotFoundException {

    }

    @Override
    public List<Category> getAll(int offerId) {
        return null;
    }

    @Override
    public Category update(Category category, int offerId) throws NotFoundException {
        return null;
    }

    @Override
    public Category create(Category category, int offerId) {
        return null;
    }

    @Override
    public Category getWithOffer(int id, int userId) {
        return null;
    }
}
