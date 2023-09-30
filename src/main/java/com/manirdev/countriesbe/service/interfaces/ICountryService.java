package com.manirdev.countriesbe.service.interfaces;

import com.manirdev.countriesbe.entity.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAllCountries();
}
