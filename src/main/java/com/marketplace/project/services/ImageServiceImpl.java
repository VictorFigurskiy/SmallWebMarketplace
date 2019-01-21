package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Image;
import com.marketplace.project.repository.ImageRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Autowired
    public ImageServiceImpl(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    public Image create(Image id, int offerId) {
        return repository.save(id, offerId);
    }

    @Override
    public void delete(int id, int offerId) throws NotFoundException {
        repository.delete(id, offerId);
    }

    @Override
    public Image get(int id, int offerId) throws NotFoundException {
        return repository.get(id, offerId);
    }

    @Override
    public void update(Image image, int offerId) {
        repository.save(image, offerId);
    }

    @Override
    public List<Image> getAll(int offerId) {
        return repository.getAll(offerId);
    }

    @Override
    public Image getWithOffer(int id, int offerId) {
        return repository.getWithOffer(id, offerId);
    }

}
