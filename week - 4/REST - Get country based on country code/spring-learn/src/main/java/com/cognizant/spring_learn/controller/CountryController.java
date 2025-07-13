package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.countryc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/country")
    public countryc getCountryIndia() {
        return (countryc) context.getBean("india");
    }
}
