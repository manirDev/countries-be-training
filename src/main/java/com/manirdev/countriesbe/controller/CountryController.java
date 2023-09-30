package com.manirdev.countriesbe.controller;

import com.manirdev.countriesbe.entity.Country;
import com.manirdev.countriesbe.service.interfaces.ICountryService;
import com.manirdev.countriesbe.util.constants.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Api.Country.BASE_URL)@RequiredArgsConstructor
public class CountryController {
    private final ICountryService countryService;
    @GetMapping()
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

}
