package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Offer;
import javassist.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;

public interface OfferService {

    Offer get(int id, int userId) throws NotFoundException;

    void delete(int id, int userId) throws NotFoundException;

    List<Offer> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId);

    List<Offer> getAll(int userId);

    Offer update(Offer offer, int userId) throws NotFoundException;

    Offer create(Offer offer, int userId);

    Offer getWithUser(int id, int userId);

    void enable(int id, boolean enable);
}
