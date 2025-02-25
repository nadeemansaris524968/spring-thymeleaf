package com.luv2code.springboot.thymeleaf_demo.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "")
public class ProgrammingProperties {
    private Map<String, String> programming = new HashMap<>();

    public ProgrammingProperties() {
    }

    public ProgrammingProperties(Map<String, String> programming) {
        this.programming = programming;
    }

    @PostConstruct
    public void init() {
        System.out.println(this.toString());
    }

    public Map<String, String> getProgramming() {
        return programming;
    }

    public void setProgramming(Map<String, String> programming) {
        this.programming = programming;
    }

    @Override
    public String toString() {
        return "ProgrammingProperties{" +
                "programming=" + programming +
                '}';
    }
}
