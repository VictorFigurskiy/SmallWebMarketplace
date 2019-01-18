package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Offer;
import javassist.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;

public class OfferServiceImpl implements OfferService {
    @Override
    public Offer get(int id, int userId) throws NotFoundException {
        return null;
    }

    @Override
    public void delete(int id, int userId) throws NotFoundException {

    }

    @Override
    public List<Offer> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId) {
        return null;
    }

    @Override
    public List<Offer> getAll(int userId) {
        return null;
    }

    @Override
    public Offer update(Offer offer, int userId) throws NotFoundException {
        return null;
    }

    @Override
    public Offer create(Offer offer, int userId) {
        return null;
    }

    @Override
    public Offer getWithUser(int id, int userId) {
        return null;
    }

    @Override
    public void enable(int id, boolean enable) {

    }
}
