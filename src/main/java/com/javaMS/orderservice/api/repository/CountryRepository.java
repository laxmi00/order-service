package com.javaMS.orderservice.api.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.javaMS.orderservice.api.Entity.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
