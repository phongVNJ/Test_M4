package com.codegym.demo.controllers;

import com.codegym.demo.models.City;
import com.codegym.demo.models.Nation;
import com.codegym.demo.services.CityService;
import com.codegym.demo.services.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;
    @Autowired
    private NationService nationService;

    @ModelAttribute("nations")
    public Iterable<Nation> phones(){
        return nationService.findAll();
    }


    @GetMapping("/cities")
    public ModelAndView listCities(@PageableDefault(size = 3) Pageable pageable, @RequestParam("s") Optional<String> s ){
        Page<City> cities;
        if(s.isPresent()){
            cities = cityService.findAllByNameContainingIgnoreCase(s.get(), pageable);
        } else {
            cities = cityService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/city/list");
        modelAndView.addObject("cities", cities);
        return modelAndView;
    }




}
