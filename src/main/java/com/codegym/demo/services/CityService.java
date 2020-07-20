package com.codegym.demo.services;

import com.codegym.demo.models.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService {
    Page<City> findAll(Pageable pageable);

    Page<City> findAllByNameContainingIgnoreCase(String name, Pageable pageable);

    City findById(Long id);

    void save(City note);

    void remove(Long id);
}
