package com.marketplace.project.services;

import com.marketplace.project.dao.jpadatarepository.ImageRepository;
import com.marketplace.project.entities.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    private ImageRepository imageRepository;

    @Autowired
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public List<Image> findAllById(Iterable<Integer> integers) {
        return imageRepository.findAllById(integers);
    }

    public <S extends Image> List<S> saveAll(Iterable<S> entities) {
        return imageRepository.saveAll(entities);
    }

    public void deleteInBatch(Iterable<Image> entities) {
        imageRepository.deleteInBatch(entities);
    }

    public <S extends Image> S save(S entity) {
        return imageRepository.save(entity);
    }

    public Optional<Image> findById(Integer integer) {
        return imageRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return imageRepository.existsById(integer);
    }

    public long count() {
        return imageRepository.count();
    }

    public void deleteById(Integer integer) {
        imageRepository.deleteById(integer);
    }

    public void delete(Image entity) {
        imageRepository.delete(entity);
    }

    public void deleteAll(Iterable<? extends Image> entities) {
        imageRepository.deleteAll(entities);
    }
}
