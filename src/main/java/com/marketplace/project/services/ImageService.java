package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Image;
import javassist.NotFoundException;

import java.util.List;

public interface ImageService {

    Image create(Image user);

    void delete(int id) throws NotFoundException;

    Image get(int id) throws NotFoundException;

    void update(Image image);

    List<Image> getAll();

    Image getWithOffer(int id);
}
