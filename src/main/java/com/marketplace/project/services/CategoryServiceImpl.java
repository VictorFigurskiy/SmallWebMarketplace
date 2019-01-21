package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Category;
import com.marketplace.project.repository.CategoryRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category get(int id, int offerId) throws NotFoundException {
        return repository.get(id, offerId);
    }

    @Override
    public void delete(int id, int offerId) throws NotFoundException {
        repository.delete(id, offerId);
    }

    @Override
    public List<Category> getAll(int offerId) {
        return repository.getAll(offerId);
    }

    @Override
    public Category update(Category category, int offerId) throws NotFoundException {
        return repository.save(category, offerId);
    }

    @Override
    public Category create(Category category, int offerId) {
        return repository.save(category, offerId);
    }

    @Override
    public Category getWithOffer(int id, int userId) {
        return null;
    }
}
