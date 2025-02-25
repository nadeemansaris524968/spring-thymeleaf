package com.luv2code.springboot.thymeleaf_demo.controller;

import com.luv2code.springboot.thymeleaf_demo.config.CountryProperties;
import com.luv2code.springboot.thymeleaf_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private final CountryProperties countryProperties;

    @Value("${favoriteLanguages}")
    private List<String> favoriteLanguages;

    @Autowired
    public StudentController(CountryProperties countryProperties) {
        this.countryProperties = countryProperties;
    }

    @GetMapping("/studentForm")
    public String getStudentForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countries", countryProperties.getCountries());
        model.addAttribute("favoriteLanguages", favoriteLanguages);
        return "student-form";
    }

    @PostMapping("/processForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        return "student-confirmation";
    }

}
