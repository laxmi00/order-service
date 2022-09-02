package com.javaMS.orderservice.api.Interface;

import java.util.List;

import com.javaMS.orderservice.api.Entity.Country;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
}