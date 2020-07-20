package com.codegym.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotNull
    private String name;
    @ManyToOne
    @JoinColumn(name = "nation_id")


    @NotNull
    private Nation nation;

    @NotNull
    private double area;

    @NotNull
    private Long population;

    @NotNull
    private double gdp;

    @NotNull
    private String description;

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City(Long id, String name, Nation nation, double area, Long population, double gdp, String description) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.description = description;
    }





}
