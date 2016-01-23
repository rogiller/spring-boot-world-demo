package com.world.rest;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import com.world.domain.Country;
import com.world.repo.CountryRepository;
import com.world.rest.dto.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Roger Diller on 1/23/16.
 */

@RestController
public class WorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CountryRepository countryRepo;


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        List<Country> countries = countryRepo.findCountries();

        Random r = new Random();
        int randomInt = r.nextInt(countries.size());

        String country = countries.get(randomInt).getName();

        System.out.println("Random Country: " + country);

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name), country);
    }
}