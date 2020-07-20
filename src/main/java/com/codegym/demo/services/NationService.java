package com.codegym.demo.services;

import com.codegym.demo.models.Nation;

public interface NationService {
    Iterable<Nation> findAll();

    Nation findById(Long id);

    void save(Nation type);

    void remove(Long id);
}
