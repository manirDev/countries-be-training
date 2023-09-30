package com.manirdev.countriesbe.service.impl;

import com.manirdev.countriesbe.entity.Country;
import com.manirdev.countriesbe.repository.ICountryRepository;
import com.manirdev.countriesbe.service.interfaces.ICountryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@RequiredArgsConstructor
//@AllArgsConstructor
public class CountryService implements ICountryService {

    private final ICountryRepository countryRepository;
    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
