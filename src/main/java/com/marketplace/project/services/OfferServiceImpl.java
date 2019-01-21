package com.marketplace.project.services;

import com.marketplace.project.controllers.model.Offer;
import com.marketplace.project.repository.OfferRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository repository;

    @Autowired
    public OfferServiceImpl(OfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public Offer get(int id, int userId) throws NotFoundException {
        return repository.get(id, userId);
    }

    @Override
    public void delete(int id, int userId) throws NotFoundException {
        repository.delete(id, userId);
    }


    @Override
    public List<Offer> getAll(int userId) {
        return repository.getAll(userId);
    }

    @Override
    public Offer update(Offer offer, int userId) throws NotFoundException {
        return repository.save(offer, userId);
    }

    @Override
    public Offer create(Offer offer, int userId) {
        return repository.save(offer, userId);
    }

    @Override
    public Offer getWithUser(int id, int userId) {
        return repository.getWithUser(id, userId);
    }

    @Override
    public void enable(int id, int userId, boolean visible) throws NotFoundException {
        Offer offer = get(id, userId);
        offer.setVisible(visible);
        repository.save(offer, userId);
    }
}
