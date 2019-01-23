package com.marketplace.project.services;

import com.marketplace.project.dao.jpadatarepository.CategoryRepository;
import com.marketplace.project.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public List<Category> findAll(Sort sort) {
        return categoryRepository.findAll(sort);
    }

    public Category getOne(Integer integer) {
        return categoryRepository.getOne(integer);
    }

    public <S extends Category> S save(S entity) {
        return categoryRepository.save(entity);
    }

    public Optional<Category> findById(Integer integer) {
        return categoryRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return categoryRepository.existsById(integer);
    }

    public long count() {
        return categoryRepository.count();
    }

    public void deleteById(Integer integer) {
        categoryRepository.deleteById(integer);
    }

    public void delete(Category entity) {
        categoryRepository.delete(entity);
    }

    public <S extends Category> Optional<S> findOne(Example<S> example) {
        return categoryRepository.findOne(example);
    }
}
