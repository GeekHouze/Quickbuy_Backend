package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.model.Country;
import com.geekhouze.stockdb_spring_backend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;


    @GetMapping(value = "/")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    @PostMapping(value = "/")
    public List<Country> addCountries(@RequestBody Country country) {
        countryRepository.save(country);
        return countryRepository.findAll();

    }

}
