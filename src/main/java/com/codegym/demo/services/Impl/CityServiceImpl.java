package com.codegym.demo.services.Impl;

import com.codegym.demo.models.City;
import com.codegym.demo.repositories.CityRepository;
import com.codegym.demo.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CityServiceImpl implements CityService {


    @Autowired
    private CityRepository cityRepository;

    @Override
    public Page<City> findAll(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    @Override
    public Page<City> findAllByNameContainingIgnoreCase(String name, Pageable pageable) {
        return cityRepository.findAllByNameContainingIgnoreCase(name,pageable);
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public void save(City note) {
        cityRepository.save(note);

    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);

    }
}
