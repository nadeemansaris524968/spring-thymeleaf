package com.luv2code.springboot.thymeleaf_demo.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "")
public class CountryProperties {

    private Map<String, String> countries = new HashMap<>();

    public CountryProperties() {
    }

    public CountryProperties(Map<String, String> countries) {
        this.countries = countries;
    }

    @PostConstruct
    public void init() {
        System.out.println(this.toString());
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountryProperties{" +
                "countriesMap=" + countries +
                '}';
    }
}
