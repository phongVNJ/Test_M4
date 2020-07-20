package com.codegym.demo.repositories;

import com.codegym.demo.models.Nation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NationRepository extends PagingAndSortingRepository<Nation, Long> {

}
