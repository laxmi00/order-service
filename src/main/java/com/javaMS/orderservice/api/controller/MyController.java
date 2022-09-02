package com.javaMS.orderservice.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.javaMS.orderservice.api.Entity.Country;
import com.javaMS.orderservice.api.Interface.ICountryService;

import java.util.List;

@RestController
@RequestMapping("/country")
public class MyController {

    @Autowired
    private ICountryService countryService;
//    @Autowired(required = true)
//    RestTemplate restTemplate;

    @GetMapping("/countries/{pageNo}/{pageSize}")
    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
            @PathVariable int pageSize) {
//    	ResponseEntity<List<String>> quoteResponse = restTemplate.exchange("http://order-service" + pageSize, HttpMethod.GET,
//                null, new ParameterizedTypeReference<List<String>>() {
//                });
//System.out.println("response"+ quoteResponse);
        return countryService.findPaginated(pageNo, pageSize);
    }
    
    
}
