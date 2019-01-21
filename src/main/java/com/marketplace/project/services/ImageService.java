package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Image;
import javassist.NotFoundException;

import java.util.List;

public interface ImageService {

    Image create(Image image, int offerId);

    void delete(int id, int offerId) throws NotFoundException;

    Image get(int id, int offerId) throws NotFoundException;

    void update(Image image, int offerId);

    List<Image> getAll(int offerId);

    Image getWithOffer(int id, int offerId);
}
