package com.javaMS.orderservice.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.javaMS.orderservice.api.Entity.Country;
import com.javaMS.orderservice.api.Interface.ICountryService;
import com.javaMS.orderservice.api.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> findPaginated(int pageNo, int pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Country> pagedResult = repository.findAll(paging);

        return pagedResult.toList();
    }
}