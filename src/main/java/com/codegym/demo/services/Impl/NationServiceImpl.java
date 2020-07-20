package com.codegym.demo.services.Impl;

import com.codegym.demo.models.Nation;
import com.codegym.demo.repositories.NationRepository;
import com.codegym.demo.services.NationService;
import org.springframework.beans.factory.annotation.Autowired;

public class NationServiceImpl implements NationService {



    @Autowired
    private NationRepository nationRepository;


    @Override
    public Iterable<Nation> findAll() {
        return nationRepository.findAll();
    }

    @Override
    public Nation findById(Long id) {
        return nationRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Nation nation) {
        nationRepository.save(nation);

    }

    @Override
    public void remove(Long id) {
        nationRepository.deleteById(id);
    }
}
